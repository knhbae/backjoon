package testCom;

import java.util.*;

public class Main1874 {
	static Scanner scan;
	
	public static void main (String[] args) {
		
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] P = new int[N];
		Stack<String> s = new Stack<String>();
		Stack<String> ss = new Stack<String>();
		int start = 1;
		
		for(int i=0;i<N;i++) {
			P[i] = scan.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			
			while (P[i]>= start) {
				
				s.push(Integer.toString(start));
				ss.push("+");
				
				start = start + 1;
			}

			if(P[i]!=Integer.parseInt(s.peek())) {
				System.out.println("NO");
				N=0;
				break;
			}
			
			s.pop();
		
			ss.push("-");
			
		}
		if(N!=0) {
			for(int i=0;i<2*N;i++) {
				System.out.println(ss.elementAt(i));
			}
		}
	}
}
