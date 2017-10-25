package testCom;

import java.util.*;

public class Main10828 {
	static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.nextLine();
		Stack<String> s = new Stack<String>();
		
		String[] lines = new String[N];
		
		for(int i=0;i<N;i++) {
			lines[i] = scan.nextLine();
		}
		for(int i=0;i<N;i++) {
			if(lines[i].substring(0, 3).equals("pus")) {
				s.push(lines[i].substring(5));
			}
			else if(lines[i].substring(0, 3).equals("top")) {
				if(!s.empty()) {
					System.out.println(s.peek());
				}
				else {
					System.out.println(-1);
				}
			}
			else if(lines[i].substring(0, 3).equals("siz")) {
				System.out.println(s.size());
			}
			else if(lines[i].substring(0, 3).equals("emp")) {
				if(!s.empty()) {
					System.out.println(0);
				}
				else {
					System.out.println(1);
				}
			}
			else if(lines[i].substring(0, 3).equals("pop")) {
				if(!s.empty()) {
					System.out.println(s.peek());
					s.pop();
				}
				else {
					System.out.println(-1);
				}
			}
		}
	}
}
