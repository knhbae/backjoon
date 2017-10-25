package testCom;

import java.util.*;

public class Main14842 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		int N = scan.nextInt();
		double NN = (double) N;
		double result = 0;
		
		if(N%2==0) {
			result = (NN-2)/2 * W;
		}
		else {
			result = (NN-1)/NN * (NN-1)/2.0 * W;
		}
		System.out.printf("%.6f", result);
	}
}
