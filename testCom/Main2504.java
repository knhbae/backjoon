package testCom;
import java.util.*;
public class Main2504 {
	static Scanner scan;
	
	public static void main(String[] args) throws Exception {
		scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		System.out.println(fun(s));
	}
	public static int fun(String vsp) {
		
		int S_len = vsp.length();
		String temp = vsp.substring(0,1);
		if(temp.equals("(")) {	
			int Test = 0;
			if(S_len==2) {
				return 2;
			}
			else {
				for(int j=0;j<S_len;j++) {
					if(vsp.substring(j,j+1).equals("(")) {
						Test = Test + 1;
					}
					else if(vsp.substring(j,j+1).equals(")")) {
						Test = Test - 1;
					}
					if(Test == 0) {
						if(j==1) {
							return 2 + fun(vsp.substring(j+1));
						}
						else {
							if(j==S_len-1) {
								return 2*fun(vsp.substring(1,j));
							}
							else {
								return 2*fun(vsp.substring(1,j)) + fun(vsp.substring(j+1));
							}
						}
					}
				}
			}
		}
		else if(temp.equals("[")) {	
			int Test = 0;
			if(S_len==2) {
				return 3;
			}
			else {
				for(int j=0;j<S_len;j++) {
					if(vsp.substring(j,j+1).equals("[")) {
						Test = Test + 1;
					}
					else if(vsp.substring(j,j+1).equals("]")) {
						Test = Test - 1;
					}
					if(Test == 0) {
						if(j==1) {
							return 3 + fun(vsp.substring(j+1));
						}
						else {
							if(j==S_len-1) {
								return 3*fun(vsp.substring(1,j));
							}
							else {
								return 3*fun(vsp.substring(1,j)) + fun(vsp.substring(j+1));
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
