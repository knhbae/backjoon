package testCom;

import java.util.Scanner;

public class Main11720 {
	
	private static Scanner scan1;
	
	public static void main(String[] args) throws Exception{
		
		scan1 = new Scanner(System.in);
		
		String S_CountNums = scan1.nextLine();
		int CountNum = 0;
		CountNum = Integer.parseInt(S_CountNums);
		int sum = 0; 
		int Num = 0;
		
		String Nums = scan1.nextLine();
		CountNum = Math.min(CountNum, Nums.length());
		
		for(int i=1;i<=CountNum;i++) {
			Num = Integer.parseInt(Nums.substring(i-1,i));
			sum = sum + Num;
		}
		System.out.println(sum);
	}
}
