package testCom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = null;
		while ((input = br.readLine()) != null) {
			System.out.println(input);
		}
	}
}