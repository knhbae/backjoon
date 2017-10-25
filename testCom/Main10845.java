package testCom;

import java.util.*;

public class Main10845 {

	static Scanner scan;
	
	public static void main (String[] args) throws Exception {
		
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		Queue<String> Q = new LinkedList<String>();
		String K;
		String[] KK = new String[N];
		scan.nextLine();
			
		for(int i=0;i<N;i++) {
			KK[i] = scan.nextLine();
		}
		for(int i=0;i<N;i++) {

			K = KK[i];
			if(K.substring(0, 3).equals("pus")) {
				Q.offer(K.substring(5));
				
			}
			else if(K.substring(0, 3).equals("pop")) {
				if(Q.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(Q.peek());
					Q.poll();
				}
				
			}
			else if(K.substring(0, 3).equals("siz")) {
				System.out.println(Q.size());
			}
			else if(K.substring(0, 3).equals("emp")) {
				if(Q.size()==0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if(K.substring(0, 3).equals("fro")) {
				if(Q.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(Q.peek());
				}
			}
			else if(K.substring(0, 3).equals("bac")) {
				if(Q.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(Q.toArray()[Q.size()-1]);
				}
			}			
		
		}
	}
}
