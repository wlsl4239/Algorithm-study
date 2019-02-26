// 0/1 Knapsack
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] v = new int[n+1];
			int [] c = new int[n+1];
			int [][] knapsack = new int[n+1][k+1];
			
			for(int i=1;i<=n;i++) {
				v[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=k;j++) {
					if(v[i] > j)
						knapsack[i][j] = knapsack[i-1][j];
					else
						knapsack[i][j] = Math.max(knapsack[i-1][j-v[i]]+c[i], knapsack[i-1][j]);
				}
			}
			System.out.println("#" + test + " " +knapsack[n][k]);
		}
	}
}
