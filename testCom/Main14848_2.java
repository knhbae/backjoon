package testCom;

import java.util.*;

public class Main14848_2 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int temp = 0;
		int K = scan.nextInt();
		int C = 0;
		int[] A =  new int[K];
		for(int i=0;i<K;i++) {
			A[i] = scan.nextInt();
		}
		
		for(int k=0;k<K;k++) {
			for(int j=0;j<A.length;j++){
				if(k%2==0) {
					temp = temp + N/A[j];
				}
				else {
					temp = temp - N/A[j];
				}
				C = lcmList(A).length;
				int[] B = new int[C];
				B = lcmList(A);
				A = new int[C];
				A = B;
			}
		}
		System.out.println(N-temp);
	}

	public static int[] lcmList(int a[]) {
		
		int n = a.length;
		int b = combination(n,1);
		int[] results = new int[b];
		int k = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				results[k] = lcm(a[i],a[j]);
				k = k+1;
			}
		}
		
		return results;
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
	public static int combination(int n, int r) {
			
			if(n == r || r == 0) return 1;
			else return combination(n - 1, r - 1) + combination(n - 1, r);
			
		}

}
