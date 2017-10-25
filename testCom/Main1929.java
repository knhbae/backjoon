package testCom;

import java.util.*;

public class Main1929 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int limit = 1000000;
		int[] p = new int[limit];
		int p_len = 1;
		int ver = 0;
		p[0] = 2;
		int p_limit = 0;
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		//select prime numbers under 1,000,000
		for(int i=2;i<=limit;i++) {
			ver = 0;
			p_limit = (int) Math.sqrt((double) i);
			for(int j=0;j<p_len;j++) {
				if(i%p[j]==0) {
					ver = ver + 1;
					break;
				}
				if(p_limit < p[j]) {
					p[p_len] = i;
					p_len = p_len + 1;
					break;
				}
			}
		}
		
		for(int k=0;k<=p_len;k++) {
			if(p[k]>=M && p[k]<=N) {
				System.out.println(p[k]);	
			}
		}
	}
}
