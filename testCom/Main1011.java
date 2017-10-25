package testCom;

import java.util.*;

public class Main1011 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		long[][] xy = new long[T][2];
		long[] z = new long[T];
		//int a =0;
		long b = 0;
		long c = 0;
		for(int i=0;i<T;i++) {
			for(int j=0;j<2;j++) {
				xy[i][j]=scan.nextLong();
			}
			c = xy[i][1]-xy[i][0];
			//a = (int) (-1 + Math.sqrt((double) (1+4*c)));
			b = (long) Math.ceil(-1 + 2*Math.sqrt((double) (c)));
			
			//if(a%2==0) {
			//	z[i]=a;
			//}
			//else {
				z[i]=b;
			//}
		}
		for(int i=0;i<T;i++) {
			System.out.println(z[i]);
		}
	}
}
