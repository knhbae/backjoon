package testCom;

import java.util.*;

public class Main1316 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		
		scan = new Scanner(System.in);

		int n = scan.nextInt();

		scan.nextLine();
		int k = 0;
		String[] a = new String[n];
		int idx = 0;
		char temp;
		//String temp_s;
		for(int i=0;i<n;i++) {
			a[i]= scan.nextLine();
		}
		for(int i=0;i<n;i++) {
			if(a[i].length()==0) {
				k = k + 1;
			}
			int len = a[i].length();
			for(int j=0;j<len;j++) {
				temp = a[i].charAt(0);
				a[i] = a[i].substring(1);
				idx = a[i].indexOf(temp);
				if (idx > 0) {
					k = k + 1;
					break;
				}
			}
		}
		System.out.println(n-k);
	}
}
