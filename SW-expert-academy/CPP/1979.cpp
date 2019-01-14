import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static int n,k;
	
	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n = sc.nextInt();
			k = sc.nextInt();
			int ans = 0;
			int arr[][] = new int[16][16];
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					arr[i][j] = sc.nextInt();
			
			for(int i=0;i<=n;i++) {
				int cnt = 0;
				for(int j=0;j<=n;j++) {
					if(arr[i][j] == 0) {
						if(cnt == k)
							ans++;
						cnt = 0;
					}
					else
						cnt++;
				}
			}
			
			for(int i=0;i<=n;i++) {
				int cnt = 0;
				for(int j=0;j<=n;j++) {
					if(arr[j][i] == 0) {
						if(cnt == k)
							ans++;
						cnt = 0;
					}
					else
						cnt++;
				}
			}
			
			System.out.println("#" + test_case + " " + ans);
		}
	}
}
