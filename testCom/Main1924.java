package testCom;


import java.util.Scanner;

public class Main1924{

	private static Scanner scan1;

	public static void main(String[] args) throws Exception {
	scan1 = new Scanner(System.in);
	
	String MD = scan1.nextLine();
	int idx = MD.indexOf(" ");
	String N1 = MD.substring(0, idx);
	String M1 = MD.substring(idx+1);
	int N = Integer.parseInt(N1);
	int M = Integer.parseInt(M1);
	
	int Day = 0;
	int Week = 0;
	
	for(int i = 1; i < N; i++){
		if(i == 1||i ==3||i == 5||i == 7||i ==8||i ==10||i ==12) {
			Day = Day + 31;
		}
		else if(i == 4||i ==6||i == 9||i == 11) {
			Day = Day + 30;
		}
		else {
			Day = Day + 28;
		}
	}
	
	Day = Day + M;

	Week = Day % 7;
	if (Week == 1) {
		System.out.print("MON");
	}
	else if (Week == 2) {
		System.out.print("TUE");
	}
	else if (Week == 3) {
		System.out.print("WED");
	}
	else if (Week == 4) {
		System.out.print("THU");
	}
	else if (Week == 5) {
		System.out.print("FRI");
	}
	else if (Week == 6) {
		System.out.print("SAT");
	}
	else{
		System.out.print("SUN");
	}
 }
}
