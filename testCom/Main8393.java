package testCom;

import java.util.Scanner;

public class Main8393 {
	
	private static Scanner scan1;
	
	public static void main(String[] args) throws Exception{
		scan1 = new Scanner(System.in);
		String Ns = scan1.nextLine();
		
		int N = Integer.parseInt(Ns);
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum = sum + i;
		}
	System.out.println(sum);
	}

}
