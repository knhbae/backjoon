package testCom;

import java.util.*;

public class Main9426_2 {
	static Scanner scan;
	
	public static void main (String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] temp = new int[K];
		int[] temp2 = new int[K];
		long sum = 0;
		
		
		for(int i=0;i<K;i++) {
			temp[i] = scan.nextInt();
		}
			temp2 = temp.clone();
			sum = sum + median(temp2);
		
		for(int j=K;j<N;j++) {
			temp[j%K] = scan.nextInt();
			temp2 = temp.clone();
			sum = sum + median(temp2);
		}
		for(int t=1;t<=K;t++) {
			System.out.println((findRank(selectionSort(temp2),2*t-1)));
		}
		System.out.println(sum);
	}
	public static int median(int[] a) {
		
		selectionSort(a);
		int n = a.length;
		int result = 0;
		if(n%2==0) {
			result = a[n/2-1];
		}
		else {
			result = a[(n-1)/2];
		}
		return result;
	}
	 public static int[] selectionSort(int a[]) {
	        
	        for(int i=0; i<a.length-1; i++) {
	            int min = i;
	            for(int j=i+1; j<a.length; j++) { 
	                if(a[j] < a[min]) { //오름차순 
	                    min = j;
	                }
	            }
	            swap(a, min, i);            
	        }
	        return a;
	    }
	public static void swap(int a[], int idx1, int idx2) {
	        int temp = a[idx1];
	        a[idx1] = a[idx2];
	        a[idx2] = temp;
	}
	public static int findRank(int a[], int b) {
		int n = a.length;
		int result = (n+1)/2;
		int top = n;
		int bottom = 1;
		for(int i=0;i<n;i++) {

			if(a[result - 1] == b) {
				return result; 
			}
			else if(a[result - 1] < b) {

				bottom = result ;
				if(top-bottom==1) {
					if(a[top-1]<b) {
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
					if(a[bottom-1]>b) {
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
