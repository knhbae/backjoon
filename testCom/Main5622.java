package testCom;

import java.util.*;

public class Main5622 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		scan = new Scanner(System.in);
		
		String b = scan.nextLine();
		int result = 0;
		
		for(int i=0;i<b.length();i++) {
			result = result + charToInt(b.charAt(i));
		}
		System.out.println(result);
	}
	public static int charToInt(char a) {
		
		if(a=='A'||a=='B'||a=='C') {
			return 3;
		}
		else if(a=='D'||a=='E'||a=='F') {
			return 4;
		}
		else if(a=='G'||a=='H'||a=='I') {
			return 5;
		}
		else if(a=='J'||a=='K'||a=='L') {
			return 6;
		}
		else if(a=='M'||a=='N'||a=='O') {
			return 7;
		}
		else if(a=='P'||a=='Q'||a=='R'||a=='S') {
			return 8;
		}
		else if(a=='T'||a=='U'||a=='V') {
			return 9;
		}
		else {
			return 10;
		}
	}
}
