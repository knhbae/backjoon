package testCom;

import java.util.*;

public class Main9426 {
	static Scanner scan;
	
	public static void main (String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] temp = new int[K];
		int[] temp2 = new int[K];
		long sum = 0;
		int remover = 0;
		int adder = 0;
		int rank_adder = 0;
		for(int i=0;i<K;i++) {
			temp[i] = scan.nextInt();
		}
			temp2 = temp.clone();
			Arrays.sort(temp);
			sum = temp[(K-1)/2];
			ArrayList<Integer> Rank = new ArrayList<Integer>();
			for(int i=0;i<K;i++) {
				Rank.add(i, temp[i]);
			}
			
			
		for(int j=K;j<N;j++) {
			remover = temp2[j%K];
			adder = scan.nextInt();
			temp2[j%K] = adder;
			//ArrayList<Integer> Ranks = new ArrayList<Integer>();
			//Ranks.addAll(Rank);
			rank_adder = findRank(Rank, adder);
			Rank.add(rank_adder-1,adder);
			Rank.remove((Object) remover);
			sum = sum + Integer.parseInt(Rank.get((K-1)/2).toString());
		}

		System.out.println(sum);
	}

	public static int findRank(List<Integer> rank, int b) {
		int n = rank.size();
		int result = (n+1)/2;
		int top = n;
		int bottom = 1;
		for(int i=0;i<n;i++) {

			if(rank.get(result - 1) == b) {
				return result; 
			}
			else if(rank.get(result - 1) < b) {

				bottom = result ;
				if(top-bottom==1) {
					if(rank.get(top - 1)<b) {
						return top+1;
					}
					else {
						return top;
					}
				}
				result = bottom + (top-bottom+1)/2;
			}
			else {

				top = result ;
				if(top-bottom==1) {
					if(rank.get(bottom - 1)>b) {
						return bottom;
					}
					else {
						return top;
					}
				}
				result = result - (top-bottom+1)/2 ;
			}
		}
		return 0;
		
	}
}
