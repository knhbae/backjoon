package testCom;

import java.util.*;

public class Main1065_2 {

	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int N = scan.nextInt();
		int CountHS = 0;
		for(int i=1;i<=N;i++) {
			CountHS = CountHS + IsHS(i);
		}
		System.out.println(CountHS);
	}
	public static int IsHS(int a) {
		
		int result = 0;
		if(a >= 100) {
			if(a/100 - (a-a/100*100)/10 == (a-a/100*100)/10 - (a-a/100*100)%10) {
				result = 1;
			}
		}
		else if (a < 100) {
			result = 1;
		}
		
		return result;
	}
}
