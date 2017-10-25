package testCom;

import java.util.*;

public class Main1427 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		int b = a.length();
		int[] c = new int[b];
		
		for(int i=0;i<b;i++) {
			c[i] = -Integer.parseInt(a.substring(i, i+1));
		}
		
		Arrays.sort(c);
		
		for(int i=0;i<b;i++) {
			System.out.print(-c[i]);
		}
	}
}
