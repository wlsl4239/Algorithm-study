import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n+1][3];
		int [][] dp = new int [n+1][3];
		for(int i=1;i<=n;i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
			arr[i][2] = Integer.parseInt(s[2]);
		}

		int ans = Integer.MAX_VALUE;

		for(int i=1;i<=n;i++) {
			dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0];
			dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1];
			dp[i][2] = Math.min(dp[i-1][1],dp[i-1][0])+arr[i][2];
		}
			
		ans = Math.min(ans,dp[n][0]);
		ans = Math.min(ans,dp[n][1]);
		ans = Math.min(ans,dp[n][2]);
		
		System.out.println(ans);
	}
}
