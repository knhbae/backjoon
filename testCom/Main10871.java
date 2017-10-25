package testCom;

import java.util.*;

public class Main10871 {
	
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		
		scan = new Scanner(System.in);
		String Fst_line = scan.nextLine();
		
		int idx = Fst_line.indexOf(" ");
		int N_Count = Integer.parseInt(Fst_line.substring(0, idx));
		int Limit = Integer.parseInt(Fst_line.substring(idx+1));
		int [] Nums = new int[N_Count] ;

		String Snd_line = scan.nextLine();
		
		for(int i=0;i<N_Count-1;i++) {
			idx = Snd_line.indexOf(" ");
			Nums[i] = Integer.parseInt(Snd_line.substring(0, idx));
			Snd_line = Snd_line.substring(idx+1);
			if (Nums[i] < Limit) {
				System.out.print(Nums[i] + " ");
			}
		}
		Nums[N_Count-1] = Integer.parseInt(Snd_line);
		if (Nums[N_Count-1] < Limit) {
			System.out.print(Nums[N_Count-1]);
		}
	}
}
