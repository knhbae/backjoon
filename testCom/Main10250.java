package testCom;

import java.util.*;

public class Main10250 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] H = new int[T];
		int[] W = new int[T];
		int[] N = new int[T];
		
		for(int i=0;i<T;i++) {
			H[i] = scan.nextInt();
		    W[i] = scan.nextInt();
		    N[i] = scan.nextInt();
 		}
		for(int i=0;i<T;i++) {
			if(N[i]%H[i]==0) {
				System.out.print(H[i]);
			}
			else {
				System.out.print(N[i]%H[i]);
			}
			if(((N[i]-1)/H[i]+1)<10) {
				System.out.print("0");
			}
			System.out.println((N[i]-1)/H[i]+1);
		}
	}
}
