package testCom;

import java.util.*;

public class Main14844 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int q = scan.nextInt();
		
		int[][] squares = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				squares[i][j] = scan.nextInt();
			}
		}
		
	}
	public static int countSqrs(int[][] a) {
		
		int n = a.length;
		int m = a[0].length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]==1) {
					a[i][j+1]=1;
				}
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[j][i]==1) {
					a[j+1][i]=1;
				}
			}
		}
		return 0;
	}
}
