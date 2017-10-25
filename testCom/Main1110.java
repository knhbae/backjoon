package testCom;

import java.util.*;

public class Main1110 {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = 0;
		int B = A;
		int i = 0;
		if(N!=0) {
			while(i==1 || N != A) {
				if(i == 0) {
					A = N;
				}
				if(i != 0) {
					A = A%10*10+ B%10;
				}
				B = A/10 + A%10;
				i++;
			}
			System.out.println(i-1);
		}
		if(N==0) {
			System.out.println("1");
		}
	}
}
