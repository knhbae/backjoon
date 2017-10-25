package testCom;

import java.util.*;

public class Main8958 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String[] OXs = new String[a];
		String temp = scan.nextLine();;
		
		for(int i=0;i<a;i++) {
			temp = scan.nextLine();
			OXs[i] = temp;
		}
		for(int i=0;i<a;i++) {
			scoring(OXs[i]);
		}
	}
	public static void scoring(String OXs) {
		char[] OXss = OXs.toCharArray();
		int result = 0;
		int temp_sum = 0;
		for(int i=0;i<OXss.length;i++) {
			if(OXs.charAt(i) == 'O') {
				temp_sum = temp_sum + 1;
				result = result + temp_sum;
			}
			if(i!=OXss.length-1) {
				if(OXs.charAt(i+1) != 'O') {
					temp_sum = 0;
				}
			}
		}
		System.out.println(result);
	}
}
