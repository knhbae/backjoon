package testCom;

import java.util.*;

public class Main2920 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] a = new int[8];
		int j = 0;
		for(int i=0;i<8;i++) {
			a[i] = scan.nextInt();
			if(a[i]==i+1) {
				j = j + 1;
			}
			else if(a[i]==8-i) {
				j = j - 1;
			}
			else {
				break;
			}

		}
		if(j==8) {
			System.out.println("ascending");
		}
		else if(j==-8){
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}
