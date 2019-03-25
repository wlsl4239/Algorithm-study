import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		int[] w = new int[N+1];
		int[] v = new int[N+1];
		int[][] sack = new int[N+1][W+1];
		
		for(int i=1;i<=N;i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=W;j++) {
				
				if(w[i] > j)
					sack[i][j] = sack[i-1][j];
				else
					sack[i][j] = Math.max(sack[i][j-w[i]]+v[i], sack[i-1][j]);
				
			}
		}
		System.out.println(sack[N][W]);
		
	}
}
