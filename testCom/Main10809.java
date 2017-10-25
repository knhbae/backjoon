package testCom;

import java.util.*;

public class Main10809 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String a = scan.nextLine();
		int c = -1;
		for(int i=97;i<123;i++) {
			//System.out.print(Character.toString((char) i));
			c = a.indexOf(Character.toString((char) i));
			System.out.print(c + " ");
		}
	}
}
