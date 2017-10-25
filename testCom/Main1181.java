package testCom;

import java.util.*;

public class Main1181 {
	static Scanner scan;
	
	public static void main (String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.nextLine();
		String[][] words = new String[50][N];
		int[] sizes = new int[50];
		int len = 0;
		String[] temp = new String[N];
		
		for(int i=0;i<N;i++) {
			temp[i] = scan.nextLine();
		}
		Arrays.sort(temp);
		for(int i=0;i<N;i++) {	
			len = temp[i].length();
			sizes[len-1] = sizes[len-1] + 1;
			words[len-1][sizes[len-1]-1] = temp[i];
		}
		for(int j=0;j<50;j++) {
			if(words[j][0] != null) {
				int lenj = words[j].length;
				for(int k=0;k<lenj;k++) {
					if(k!=0 && words[j][k]!=null) {
						if( !words[j][k].equals(words[j][k-1])) {
							System.out.println(words[j][k]);
						}
					}
					else if(k==0) {
						System.out.println(words[j][k]);
					}
				}
			}
		}
	}
}
