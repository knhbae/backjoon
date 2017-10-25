package testCom;

import	java.util.*;

public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		//double c;
		A = sc.nextInt();
		
			if(A < 5&& A!=3) {
				System.out.println( "-1" );
			}
			else if(A==3) {
				System.out.println("1");
			}
			else if(A==6) {
				System.out.println("2");
			}
			else if(A==9) {
				System.out.println("3");
			}
			else if(A==12) {
				System.out.println("4");
			}
			else if(A%5==0) {
				System.out.println( (A)/5 );
			}
			else if(A>3&&(A-3)%5==0) {
				System.out.println( (A-3)/5+1 );
			}
			else if(A>6&&(A-6)%5==0) {
				System.out.println( (A-6)/5+2 );
			}
			else if(A>9&&(A-9)%5==0) {
				System.out.println( (A-9)/5+3 );
			}
			else if(A>12&&(A-12)%5==0) {
				System.out.println( (A-12)/5+4 );
			}
			else {
				System.out.println( "-1" );
			}
	}
}