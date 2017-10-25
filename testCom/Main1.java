package testCom;
import	java.util.*;

public class Main1 {
	public static void main(String[] args) {
		String a[] = null;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<100;i++) {
			a[i] = sc.nextLine();
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
