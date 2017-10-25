package testCom;

import java.util.*;

public class Main1475 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String a = scan.nextLine();
		int c = a.length();
		char[] b = a.toCharArray();
		int[] d = new int[c];
		int[] e = new int [9];
		for(int i=0;i<c;i++) {
			 d[i] = Character.getNumericValue(b[i]);
		 	for(int j=0;j<9;j++) {
		 		if(j==d[i]) {
		 			e[j]=e[j] + 1;
		 		}
		 		else if(j==6 && d[i]==9) {
		 			e[j]=e[j] + 1;
		 		}
		 	}
		}
		e[6]=(int) Math.ceil(e[6]*0.5);
		Arrays.sort(e);
		System.out.println(e[8]);
			
	}
}
