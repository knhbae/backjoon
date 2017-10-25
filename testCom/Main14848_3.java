package testCom;

import java.util.*;

public class Main14848_3 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();

		int[] A =  new int[K];
		for(int i=0;i<K;i++) {
			A[i] = scan.nextInt();
		}
		int temp_len = (int) (Math.pow(2, K) - 1);
		int[] temp1 = new int[temp_len];
		
		temp1 = lcmL(A);
		double sum = N;
		for(int i=0;i<temp_len;i++) {
			sum = sum + N/temp1[i];
		}
		int re = (int) sum;
		System.out.println(re);
	}
	public static int[] lcmL(int a[]) {
		int b = 1;
		int[] results = new int[1];
		int n = a.length;
		if(n == 1) {
			results[0] = -a[0];
		}
		else {
			b = (int) (Math.pow(2, n) - 1);
			int b_1 = (int) (Math.pow(2, n-1) - 1);
			int b_2 = (int) (Math.pow(2, n-1));
			results = new int[b];
			int[] results_1 = new int[b_1];
			int[] results_2 = new int[b_2];
			int[] a_1 = new int[n-1];
			for(int i=0;i<n-1;i++) {
				a_1[i]=a[i];
			}
			results_1 = lcmL(a_1);
			for(int i=0;i<b_2-1;i++) {
				results_2[i] = -lcm(results_1[i], a[n-1]);
			}
			results_2[b_2 - 1] = -a[n-1]; 
			for(int i=0;i<b;i++) {
				if(i<b_1) {
					results[i]=results_1[i];
				}
				else {
					results[i]=results_2[i-b_1];
				}
			}
		}
		return results;
	}
	
	public static int lcm(int a, int b) {
		    int gcd_value = gcd(a, b);
		    if (gcd_value == 0) return 0;
		    return (int) a * b / gcd_value;
		  }

	public static int gcd(int a, int b) {
		    while (b != 0) {
		      int temp = a % b;
		      a = b;
		      b = temp;
		    }
		    return Math.abs(a);
	}
}
