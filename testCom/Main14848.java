package testCom;

import java.util.*;

public class Main14848 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int temp = 0;
		int K = scan.nextInt();
		int[] A =  new int[K];
		for(int i=0;i<K;i++) {
			A[i] = scan.nextInt();
		}
		
		for(int k=1;k<=N;k++) {
			for(int j=0;j<A.length;j++){
				if(k%A[j]==0) {
					temp = temp+1;
					break;
				}	
			}
		}
		System.out.println(N-temp);
	}
}
