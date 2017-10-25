package testCom;

import java.util.*;

public class Main10817 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		scan = new Scanner(System.in);
		
		String S_Nums = scan.nextLine();
		int idx = S_Nums.indexOf(" ");
		int Num1 = Integer.parseInt(S_Nums.substring(0, idx));
		String S_Nums_2 = S_Nums.substring(idx+1);
		int idx2 = S_Nums_2.indexOf(" ");
		int Num2 = Integer.parseInt(S_Nums_2.substring(0, idx2));
		int Num3 = Integer.parseInt(S_Nums_2.substring(idx2+1));
		
		int O1,O2;
		
		O1 = Math.max(Num1, Num2);
		Num2 = Math.min(Num1, Num2);
		Num1 = O1;
		O2 = Math.max(Num2, Num3);
		Num3 = Math.min(Num2, Num3);
		Num2 = O2;
		O1 = Math.max(Num1, Num2);
		Num2 = Math.min(Num1, Num2);
		Num1 = O1;
		
		System.out.println(Num2);
	}
}
