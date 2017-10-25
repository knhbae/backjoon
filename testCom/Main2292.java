package testCom;

import java.util.*;

public class Main2292 {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = (double) a;
		double c = Math.pow((-1.0/3.0) + (4.0/3.0)*b, 0.5)/2.0 + 1.4999999999 ;
		int d = (int) c;
		
		System.out.println(d);
	}
}
