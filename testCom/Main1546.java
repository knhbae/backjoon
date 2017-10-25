package testCom;

import java.util.*;

public class Main1546 {
	
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		
		scan = new Scanner(System.in);
		int N_Count = scan.nextInt();
		
		double[] Nums = new double[N_Count];
		double Max = 0.0;
		double Sum = 0.0;
		
		for(int i=0;i<=N_Count-1;i++) {
			
			Nums[i] = scan.nextInt();
			
		}
		Arrays.sort(Nums);
		Max = Nums[N_Count-1];
			
		for (int j=0;j<N_Count;j++) {
			Sum = Sum + Nums[j];
		}
		double Sum1 = (double) Sum;
		double Max1 = (double) Max;
		double N_Count1 = (double) N_Count;
		double Avg = (double) Sum1 / Max1 * 100.0 / N_Count1;
		System.out.format("%.2f", Avg);
	}
	
}
