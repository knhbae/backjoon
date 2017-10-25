package testCom;

import java.util.*;

public class Main1193 {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = (double) a;
		double c = Math.pow((-1.0/2.0) + 8.0*b, 0.5)/2.0 - 0.50000001 ;
		int d = (int) c+1;
	    int e = d*(d+1)/2;
	    int f = e - a;
	    if (d%2==0) {
	    	System.out.println((d-f)+"/"+(1+f));
	    }
	    else {
	    	System.out.println((1+f)+"/"+(d-f));
	    }
	}
}
