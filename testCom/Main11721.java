package testCom;

import java.util.*;

public class Main11721 {
	
	static Scanner scan1;
	
	public static void main(String[] args) throws Exception{
		scan1 = new Scanner(System.in);
		String Sentence = scan1.nextLine();
		int lenSen=10;
		
		for(int i=0;i<Sentence.length();i=i+10) {
			if(Sentence.length() < i+10) {
				lenSen = Sentence.length() - i;
			}
			System.out.println(Sentence.substring(i, i+lenSen));
		}
	}
}
