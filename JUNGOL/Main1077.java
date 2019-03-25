import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();

		int [][] item = new int [N+1][2];
		int [][] dp = new int[N+1][W+1];
		
		for(int i=1;i<=N;i++) {
			item[i][0] = sc.nextInt();
			item[i][1] = sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=W;j++) {
				if(j<item[i][0]) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i][j-item[i][0]] + item[i][1], dp[i-1][j]);
			}
		}
		System.out.println(dp[N][W]);
		
	}
}
