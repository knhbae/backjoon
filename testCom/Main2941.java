package testCom;

import java.util.*;

public class Main2941 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String[] b= new String[8];
		b[0] = "c=";
		b[1] = "c-";
		b[2] = "dz=";
		b[3] = "d-";
		b[4] = "lj";
		b[5] = "nj";
		b[6] = "s=";
		b[7] = "z=";
		String temp;
		
		int k=a.length();
		int t=1;
		int count = 0;
		for(int i=0;i<k;i=i+t) {
			for(int j=0;j<8;j++) {
				temp = a.substring(i, i+Math.min(k-i, 2));
				if(b[j].equals(temp)){
					t = 2;
					break;
				}
				else 
					temp = a.substring(i, i+Math.min(k-i, 3));
				if(b[j].equals(temp)) {
					t = 3;
					break;
				}
				else {
					t = 1;
				}
			}
			count = count + 1;
		}
		System.out.println(count);
	}
}
