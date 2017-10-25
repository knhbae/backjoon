package testCom;

import java.util.*;

public class Main4344 {
	
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		
		scan = new Scanner(System.in);
		int C = scan.nextInt();
		
		double [][] score = new double[C][];
		double [] avg = new double[C];
		double [] over_avg_ratio = new double[C];
		int [] K = new int[C];
		
		for(int i=0; i<C; i++) {
			K[i] = scan.nextInt();
			score[i] = new double[K[i]];
			for(int j=0; j<K[i]; j++) {
				score[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<C; i++) {
			for(int j=0; j < K[i]; j++) {
				avg[i] = avg[i] + score[i][j];
			}
			avg[i] = avg[i]/K[i];
		}
		for(int i=0; i<C; i++) {
			over_avg_ratio[i] = 0.0;
			for(int j=0; j < K[i]; j++) {
				if(score[i][j]>avg[i]) {
					over_avg_ratio[i] = over_avg_ratio[i] + 1;
				}
			}
			System.out.format("%.3f%% \n", over_avg_ratio[i] = over_avg_ratio[i]/K[i]*100);
		}
	}
}
