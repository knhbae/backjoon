package testCom;

import java.util.*;

public class Main2581 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int limit = 10000;
		int[] p = new int[limit];
		int p_len = 1;
		int ver = 0;
		p[0] = 2;
		int sum = 0;
		int mins = 0;
		int min_temp = 0;
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		//select prime numbers under 10,000
		for(int i=2;i<=limit;i++) {
			ver = 0;
			for(int j=0;j<p_len;j++) {
				if(i%p[j]!=0) {
					ver = ver + 1;
				}
				if(ver == p_len) {
					p[p_len] = i;
					p_len = p_len + 1;
				}
			}
		}
		

		
		for(int k=0;k<=p_len;k++) {
			if(p[k]>=M && p[k]<=N) {
				if(min_temp == 0) {
					mins = p[k];
					min_temp = 1;
				}
				sum = sum + p[k];
			}
		}
		if(sum==0) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(mins);	
		}
		
	}
}
