package array1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution3307_최장증가부분수열_서울9반_김경수 {

	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/Solution3307_input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n;
			int ans = 0;
			int[] arr = new int[1001];
			int[] dp = new int[1001];
			n = sc.nextInt();
		
			for(int i=0;i<n;i++)
				arr[i] =sc.nextInt();

			for(int i=0;i<n;i++) {
				if(dp[i] == 0)
					dp[i] = 1;
				for(int j=0;j<i;j++) {
					if(arr[i] >= arr[j] && dp[i] < dp[j]+1)
						dp[i] = dp[j]+1;
				}
			}
			for(int i=0;i<n;i++)
				ans = Integer.max(ans, dp[i]);
			System.out.println("#"+test_case+" " + ans);
			
		}
	}
}



