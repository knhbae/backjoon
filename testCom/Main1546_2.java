package testCom;

import java.util.Arrays;
import java.util.Scanner;

public class Main1546_2 {

	private static Scanner sc;

	public static void main(String args[]) throws Exception {
		sc = new Scanner(System.in);
		int count = 0;
		double max = 0;
		double sum = 0;
		count = sc.nextInt();
		double[] score = new double[count];
		
		for(int i=0; i<count; i++){
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		max = score[count-1];
		
		for(int i=0; i<count; i++){
			score[i] = (score[i]/max)*100;
		}
		
		for(int i=0; i<count; i++){
			sum = sum + score[i];
		}
		System.out.format("%.2f", sum/count);
	}
}

