package testCom;


import java.util.Scanner;

public class Main2441{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	
	for(int i = 1; i <= N; i++){
		for(int j = N; j > N-i+1; j--) {
			System.out.print(" ");
		}
		for(int j = N; j >= i; j--) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
 }
}
