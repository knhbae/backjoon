package testCom;

import java.util.*;

public class Main1260 {
	static Scanner scan;
	private static int N;
	private static boolean[] visited;
	private static boolean[][] NN;
	private static boolean[] visited2;
	private static int M;
	
	public static void main (String[] args) {
		scan = new Scanner(System.in);
		
		N = scan.nextInt();
		int M = scan.nextInt();
		int V = scan.nextInt();
		
		NN = new boolean[N][N];
		visited = new boolean[N];
		visited2 = new boolean[N];
		
		for(int i=0;i<M;i++) {
			int here = scan.nextInt();
			int there = scan.nextInt();
			NN[here-1][there-1] = true;
			NN[there-1][here-1] = true;
		}
		visited[V-1] = true;
		dfs(V);
		System.out.println("");
		System.out.print(V + " ");
		visited2[V-1] = true;
		int[] VV = new int[1];
		VV[0] = V;
		bfs(VV);
	}
	public static void dfs(int here) {
		System.out.print(here + " ");
		for(int j=0;j<N;j++) {
			if(NN[here-1][j] && visited[j]==false) {
				visited[j] = true;
				dfs(j+1);
			}
		}
	}
	public static void bfs(int[] heres) {
		int len = heres.length;
		int k = 0;
		LinkedList<Integer> VV = new LinkedList<Integer>();
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<N;j++) {
				if(NN[heres[i]-1][j] && visited2[j]==false) {
					visited2[j] = true;
					VV.offer(j+1);
					k = k+1;
					System.out.print((j+1) + " ");
				}
			}
		}
		int lenV = VV.size();
		
		if (lenV==0) {

		}
		else {
			int[] VVV = new int[lenV];
			for(int i=0;i<lenV;i++) {
				VVV[i]=VV.get(i);
			}
			bfs(VVV);
		}	
	}
}
