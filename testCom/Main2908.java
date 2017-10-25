package testCom;

import java.util.*;

public class Main2908 {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		
		c = Math.max(reverse(a), reverse(b));
		System.out.println(c);
	}
	public static int reverse(int a) {
		
		int a1,a2,a3;
		
		a1 = a%10;
		a3 = a/100;
		a2 = a-a3*100-a1;
		a2 = a2/10;
		a = a1*100 + a2*10 + a3;
		return a;
	}
}
