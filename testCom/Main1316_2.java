package testCom;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1316_2 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception{
		
		scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = scan.nextInt();

		int k = 0;
		String[] a = new String[n];

		int t = 0;
		int kk = 0;
		char[] test = new char[26];
		
		for(int i=0;i<n;i++) {
			a[i]= br.readLine();
		}
		for(int i=0;i<n;i++) {
			test = new char[26];

			if(a[i].length()!=1) {
				for(int j=0;j<a[i].length()-1;j++) {
					if(a[i].charAt(j)!=a[i].charAt(j+1)) {
						for(int s=0;s<26;s++) {
							if(test[s]==a[i].charAt(j+1)) {
								k = k + 1;
								break;
							}
						}
						test[t] = a[i].charAt(j+1);
						t = t + 1;
					}
					if(k!=kk) {
						kk = k;
						break;
					}
				}
			}
		}
		System.out.println(n-k);
	}
}
