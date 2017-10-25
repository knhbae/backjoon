package testCom;

import java.util.*;

public class Main1152 {
	
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String Sentences = scan.nextLine();
		
		int idx = 1;
		if (Sentences.equals(" ")) {
			idx = 0;
		}
		else {
			int k = Sentences.length();
			for(int i=1;i<k-1;i++) {
				char tmpchar = Sentences.charAt(i);
				if(tmpchar == ' ') {
					idx++;
				}
			}
		}
		System.out.println(idx);
	}
}
