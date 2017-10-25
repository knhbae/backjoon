package testCom;

import java.util.Scanner;

public class test14848 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		int[] A =  new int[K];
		for(int i=0;i<K;i++) {
			A[i] = scan.nextInt();
		}
		choose(A, K);
		System.out.println("done");
	}
	public static int[][] choose(int[] a, int n){
		int count = combination(a.length, n);
		int[][] result = new int[count][n];
		int[] a_n_1 = new int[n-1];
		int[][] b_1 = null;
		int[][] b_2 = null;
		
		for(int i=0;i<n-1;i++) {
			a_n_1[i]=a[i];
		}
		b_1 = choose(a_n_1, n);
		b_2 = choose(a_n_1, n-1);
		for(int i=0;i<b_2.length;i++) {
			b_2[i][n-1]=a[n-1];
		}
		for(int i=0;i<b_1.length;i++) {
			result[i]=b_1[i];
		}
		for(int i=0;i<b_2.length;i++) {
			result[b_1.length+i]=b_1[i];
		}
		
		return result;
	}
	public static int combination(int n, int r) {
		
		if(n == r || r == 0) return 1;
		else return combination(n - 1, r - 1) + combination(n - 1, r);
		
	}
	
}
