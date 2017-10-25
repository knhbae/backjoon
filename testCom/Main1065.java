package testCom;

import java.util.*;

public class Main1065 {

	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(IsHS(N));
	}
	public static int IsHS(int a) {
		
		int result = 0;
		if(a >= 100) {
			int b = a/100 - (a-a/100*100)/10 ;
			int c = (a-a/100*100)/10 - (a-a/100*100)%10 ;
			if(b == c) {
				result = 1;
			}
		}
		else if (a < 100) {
			result = 1;
		}
		
		return result;
	}
}
