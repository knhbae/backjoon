package testCom;

import java.util.*;


public class Main2448_2 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		StringBuilder StarLine = new StringBuilder();
		char[][] space = new char [a][2*a-1];
		for (int i = 0; i < a; i++) {
			Arrays.fill(space[i], ' ');
		}
		int [][] stars;
		
		int k = 0;
		int temp_a = a;
		while(temp_a != 3) {
			temp_a = temp_a/2;
			k++;
		}
		int temp1 = (int) (8 * Math.pow(3, k));
		stars = new int[temp1][2];
		int temp = (int) (3 * Math.pow(2, k+1));
			for(int i=k;i>=0;i--) {
				int temp2 = (int) (8 * Math.pow(3, k-i-1));
				int temp3 = (int) (3 * Math.pow(2, i));
				int temp4 = (int) (3 * Math.pow(2, k-i-1));
				if(i==k) {
					stars[0][0] = 1;
					stars[0][1] = temp3;
					space[stars[0][0]-1][stars[0][1]-1]= '*';
					stars[1][0] = 1+1;
					stars[1][1] = temp3-1;
					space[stars[1][0]-1][stars[1][1]-1]= '*';
					stars[2][0] = 1+1;
					stars[2][1] = temp3+1;
					space[stars[2][0]-1][stars[2][1]-1]= '*';
					stars[3][0] = 1+2;
					stars[3][1] = temp3-2;
					space[stars[3][0]-1][stars[3][1]-1]= '*';
					stars[4][0] = 1+2;
					stars[4][1] = temp3-1;
					space[stars[4][0]-1][stars[4][1]-1]= '*';
					stars[5][0] = 1+2;
					stars[5][1] = temp3;
					space[stars[5][0]-1][stars[5][1]-1]= '*';
					stars[6][0] = 1+2;
					stars[6][1] = temp3+1;
					space[stars[6][0]-1][stars[6][1]-1]= '*';
					stars[7][0] = 1+2;
					stars[7][1] = temp3+2;
					space[stars[7][0]-1][stars[7][1]-1]= '*';
				}
				else {
					for(int m=temp2;m<2*temp2;m++) {
						int temp6 = stars[m-temp2][0];
						int temp7 = stars[m-temp2][1];
						stars[m][0] = temp6 + temp4;
						stars[m][1] = temp7 - temp4;
						space[stars[m][0]-1][stars[m][1]-1]= '*';
					}
					for(int m=2*temp2;m<3*temp2;m++) {
						int temp8 = stars[m-2*temp2][0];
						int temp9 = stars[m-2*temp2][1];
						stars[m][0] = temp8 + temp4;
						stars[m][1] = stars[m-2*temp2][1] + temp4;
						space[stars[m][0]-1][stars[m][1]-1]='*';
					}
				}
			}
		for(int i=1;i<=a;i++) {
			String space_b = new String(space[i-1]);
			StarLine.append(space_b);
			if(i!=a){
				StarLine.append("\n");
			}
		}
		System.out.println(StarLine);
			}
}
