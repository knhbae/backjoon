package testCom;

import java.util.Scanner;

public class Main2 {
	private static Scanner sc;

	public static void main(String[] args) {
		String a;
		sc = new Scanner(System.in);
		
		while((a = sc.nextLine()) != null) {
			System.out.println(a);
		}
	}
}
