package testCom;

import java.util.*;

public class Main14843 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double sum = 0;
		double S,A,T,M = 0;
		for(int i=0;i<N;i++) {
			S = scan.nextDouble();
			A = scan.nextDouble();
			T = scan.nextDouble();
			M = scan.nextDouble();
			sum = sum + 0.25*S*(1+1/A)*(1+M/T);
		}
		int P = scan.nextInt();
		int P_15 = (P+1)*15/100;
		double P_scores = 0.0;
		int count = 0;
		for(int j=0;j<P;j++) {
			P_scores = scan.nextDouble();
			if(sum<P_scores) {
				count = count + 1;
			}
		}
		if(count>=P_15) {
			System.out.print("The total score of Younghoon is ");
			System.out.printf("%.2f", sum);
			System.out.print(".");
		}
		else {
			System.out.print("The total score of Younghoon \"The God\" is ");
			System.out.printf("%.2f", sum);
			System.out.print(".");
		}
	}
}
