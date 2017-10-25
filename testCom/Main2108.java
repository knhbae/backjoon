package testCom;

import java.util.*;

public class Main2108 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] K = new int[N];
		
		for(int i=0;i<N;i++) {
			K[i] = scan.nextInt();
		}
		Arrays.sort(K);
		System.out.println(avg(K));
		System.out.println(median(K));
		System.out.println(mode(K));
		System.out.println(range(K));
	}
	public static int avg(int[] a) {
		int len = a.length;
		long sum = 0;
		for(int i=0;i<len;i++) {
			sum = sum + a[i];
		}
		return (int) Math.round((double) sum/(double) len);

	}
	public static int median(int[] a) {
		int len = a.length;
		return a[(len+1)/2-1];
	}
	public static int mode(int[] a) {
		int[] temp = new int[8001];
		int len = a.length;
		int[] temp2 = new int[8001];

		int j = 0;
		for(int i=0;i<len;i++) {
			temp[a[i]+4000] = temp[a[i]+4000] + 1;
		}
		temp2 = temp.clone();
		Arrays.sort(temp2);
		
		int max = temp2[8000];
		
		for(int i=0;i<8001;i++) {
			if(max==temp[i]) {
				j = j+1;
			}
		}
		
		int[] temp3 = new int[j] ;
		j = 0;
		for(int i=0;i<8001;i++) {
			if(max==temp[i]) {
				temp3[j] = i;
				j = j+1;
			}
		}
		Arrays.sort(temp3);
		if(temp3.length == 1) {
			return temp3[0]-4000;
		}
		else {
			return temp3[1]-4000;
		}
	}
	public static int range(int[] a) {
		int len = a.length;
		return a[len-1]-a[0];
	}
}
