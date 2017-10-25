package testCom;

import java.util.*;
import java.util.Arrays;

public class Main2448 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		Stars(a);
	}
	public static void Stars(int a) {
		
		StringBuilder StarLine = new StringBuilder();
		
		int [][] stars,stars_temp;
		
		int k = 0;
		int temp_a = a;
		while(temp_a != 3) {
			temp_a = temp_a/2;
			k++;
		}
		int temp1 = (int) (8 * Math.pow(3, k));
		stars = new int[temp1][2];
		stars_temp = new int[temp1][2];
		
		stars[0][0] = 1;
		stars[1][0] = 2;
		stars[2][0] = 2;
		stars[3][0] = 3;
		stars[4][0] = 3;
		stars[5][0] = 3;
		stars[6][0] = 3;
		stars[7][0] = 3;
		stars[0][1] = 3;
		stars[1][1] = 2;
		stars[2][1] = 4;
		stars[3][1] = 1;
		stars[4][1] = 2;
		stars[5][1] = 3;
		stars[6][1] = 4;
		stars[7][1] = 5;

		
		if(k!=0) {
			for(int i=1;i<=k;i++) {
				int temp2 = (int) (8 * Math.pow(3, i-1));
				int temp3 = (int) (3 * Math.pow(2, i-1));
				for(int j=0;j<3;j++) {

					if(j==0) {
						for(int m=0;m<temp2;m++) {
							stars_temp[m][0] = stars[m][0];
							stars_temp[m][1] = stars[m][1] + temp3;
						}
					}
					else if(j==1) {
						for(int m=0;m<temp2;m++) {
							stars_temp[m+temp2][0] = stars[m][0]+ temp3;
							stars_temp[m+temp2][1] = stars[m][1];
						}
					}
					else if(j==2) {
						for(int m=0;m<temp2;m++) {
							stars_temp[m+2*temp2][0] = stars[m][0] + temp3;
							stars_temp[m+2*temp2][1] = stars[m][1] + 2*temp3;
						}
					}
				}
				//stars = stars_temp;
				for(int m=0;m<3*temp2;m++) {
					stars[m][0] = stars_temp[m][0];
					stars[m][1] = stars_temp[m][1];
				}
				
			}
		}
		
		int temp4 = (int) (8 * Math.pow(3, k));
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=2*a;j++) {
				int star = 0;
				for(int t=0; t<temp4;t++) {
					if(stars[t][0]==i&&stars[t][1]==j) {
						star++;
					}
				}
				if(star>0) {
					StarLine.append("*");
				}
				else if(j==2*a) {
					StarLine.append("\n");
				}
				else {
					StarLine.append(" ");
				}
			}
		}
		System.out.println(StarLine);
	}
}
