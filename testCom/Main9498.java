package testCom;

import java.util.*;

public class Main9498 {

	static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		
		scan = new Scanner(System.in);
		int score = Integer.parseInt(scan.nextLine());
		
		if (score/90 == 1) {
			System.out.println("A");
		}
		else if (score/80 == 1) {
			System.out.println("B");
		}
		else if (score/70 == 1) {
			System.out.println("C");
		}
		else if (score/60 == 1) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
