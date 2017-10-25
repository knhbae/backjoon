package testCom;

import java.util.*;

public class Main2675 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int k = scan.nextInt();
		
		output(k);
	}
	public static void output(int k) {
		
		int[] a = new int[k];
		String[] b = new String[k];
		char[][] c = new char[k][];
		
		for(int i=0;i<b.length;i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextLine();
			c[i] = b[i].toCharArray();
		}
		for(int i=0;i<b.length;i++) {
			for(int j=1;j<c[i].length;j++) {
				for(int l=0;l<a[i];l++) {
				System.out.print(c[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
}
