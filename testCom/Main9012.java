package testCom;

import java.util.*;

public class Main9012 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.nextLine();
		String[] S = new String[N];
		
		for(int i=0;i<N;i++) {
			S[i] = scan.nextLine();
		}
		
		for(int i=0;i<N;i++) {
			int S_len = S[i].length();
			int Test = 0;
			for(int j=0;j<S_len;j++) {
				if(S[i].substring(j,j+1).equals("(")) {
					Test = Test + 1;
				}
				else if(S[i].substring(j,j+1).equals(")")) {
					Test = Test - 1;
				}
				if(Test < 0) {
					System.out.println("NO");
					break;
				}
			}
			if(Test == 0) {
				System.out.println("YES");
			}
			else if(Test > 0){
				System.out.println("NO");
			}
			
		}
	}
}
