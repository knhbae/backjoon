package testCom;

import java.util.*;

public class Main2775 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] k = new int[T];
		int[] n = new int[T];
		for(int i=0;i<T;i++) {
			k[i] = scan.nextInt();
			n[i] = scan.nextInt();
		}
		for(int i=0;i<T;i++) {
			System.out.println(NP(k[i],n[i]));
		}
	}
	public static int NP(int a, int b) {
		if(b==1) {
			return 1;
		}
		else if(a==0) {
			return b;
		}
		else {
			return NP(a-1,b) + NP(a,b-1);
		}
	}
}
