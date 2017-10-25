package testCom;

import java.util.*;

public class Main2750 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] M = new int[N];
		
		for(int i=0;i<N;i++) {
			M[i] = scan.nextInt();
		}
		Arrays.sort(M);
		
		for(int i=0;i<N;i++) {
			System.out.println(M[i]);
		}
	}
}
