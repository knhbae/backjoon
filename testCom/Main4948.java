package testCom;

import java.util.*;

public class Main4948 {
	static Scanner scan;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		int limit = 10000;
		int[] p = new int[limit];
		int p_len = 1;
		int ver = 0;
		p[0] = 2;
		int p_limit = 0;		
		
		
	
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
		
		int N = scan.nextInt();
		int[] Nums = new int[N];
		
		for(int i=0;i<N;i++) {
			Nums[i] = scan.nextInt();
		}
		for(int i=0;i<N;i++) {
			int x = 0;
			int y = 0;
			for(int j=0;j<p_len;j++) {
				x = Nums[i] - p[j];
				if(Nums[i]/2 < p[j]) {
					break;
				}
				for(int k=j;k<p_len;k++) {
					if(x == p[k]) {
						y = p[j];
						break;
					}
					if(x < p[k]) {
						break;
					}
				}
			}
			System.out.println(y + " " + (Nums[i] - y));
		}
	}
}
