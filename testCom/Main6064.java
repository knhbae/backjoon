package testCom;

import java.util.*;

public class Main6064 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int[] M = new int[k];
		int[] N = new int[k];
		int[] x = new int[k];
		int[] y = new int[k];
		int xx, yy = 0;
		
		for(int i=0;i<k;i++){
			M[i] = scan.nextInt();
			N[i] = scan.nextInt();
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		for(int i=0;i<k;i++){
			
			xx = x[i];
			yy = y[i];
			
			while(xx!=yy) {
				if(xx>yy) {
					yy = yy + N[i];
					if(lcm(M[i],N[i]) < yy) {
						System.out.println("-1");
						break;
					}
				}
				else if (yy>xx) {
					xx = xx + M[i];
					if(lcm(M[i],N[i]) < xx) {
						System.out.println("-1");
						break;
					}
				}
			}
			if(xx==yy) {
				System.out.println(xx);
			}
		}
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
