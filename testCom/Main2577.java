package testCom;

import java.util.*;

public class Main2577 {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int d = a*b*c;
		
		CountNum(d);
	}
	
	public static void CountNum(int a) {
		String b = String.valueOf(a);
		int[] d = new int[b.length()];
		int[] results = new int[10];
		
		for(int j=0;j<10;j++) {
			for(int i=0;i<b.length();i++) {
				char c = b.charAt(i);
				d[i] = Character.getNumericValue(c);
				if(d[i]==j) {
					results[j] = results[j] + 1;
				}
			}
			System.out.println(results[j]);
		}
	}
}
