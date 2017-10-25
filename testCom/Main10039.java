package testCom;

import java.util.*;

public class Main10039 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int a = 5;
		int[] b = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			b[i] = scan.nextInt();
			b[i] = Math.max(40, b[i]);
			sum = sum + b[i];
		}
		System.out.println(sum/5);
	}
}
