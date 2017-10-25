package testCom;

import java.util.*;

public class Main1157 {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		a = a.toLowerCase();
		
		int[] Nums = new int[26];
		int[] Nums_temp = new int[26];
		for(int i=0;i<26;i++) {
			for(int j=0;j<a.length();j++) {
				int c = i+97;
				String d = Character.toString((char) c);
				char f = d.charAt(0);
				char e = a.charAt(j);
				if(e==f) {
					Nums[i]=Nums[i]+1;
					Nums_temp[i] = Nums_temp[i] + 1;
				}
			}
		}
		
		Arrays.sort(Nums);
		if(Nums[25]==Nums[24]) {
			System.out.println("?");
		}
		else {
			for(int k=0;k<26;k++) {
				if(Nums_temp[k]==Nums[25]) {
					int g = 97+k;
					System.out.println(Character.toString((char) g).toUpperCase());
					break;
				}
			}
		}
	}
}
