package testCom;

import java.util.*;

public class Main1978 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] P = {2,3,5,7,11,13,17,19,23,29,31};
		int isP = 0;
		int sum = 0;
		for(int i=0;i<N;i++) {
			isP = scan.nextInt();
			for(int j=0;j<11;j++) {
				if(isP%P[j]==0 && isP!=P[j]) {
					sum = sum + 1;
					break;
				}
				else if(isP==1) {
					sum = sum + 1;
					break;
				}
			}
		}
		System.out.println(N-sum);
	}
}
