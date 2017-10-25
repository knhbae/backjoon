package testCom;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main10989 {
	static Scanner scan;
	
	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		//StringTokenizer st = new StringTokenizer( br.readLine() );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		
		int N = scan.nextInt();
		int[] M = new int[10000];
		int temp = 0;
		for(int i=0;i<N;i++) {
			//temp = Integer.parseInt(st.nextToken());
			temp = scan.nextInt();
			M[temp-1] = M[temp-1] + 1;
		}
		for(int j=0;j<10000;j++) {
			for(int n=0;n<M[j];n++){
				bw.write((j+1)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
