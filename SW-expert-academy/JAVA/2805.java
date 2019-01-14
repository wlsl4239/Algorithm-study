import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			for(int i=0;i<n;i++){
				String s = sc.next();
				
				for(int j=0;j<n;j++)
					arr[i][j] = (int)s.charAt(j) - '0';
			}
			int ans = 0;
			int num = 1;
			int startnum = n/2;
			for(int i=0;i<n/2;i++) {

				for(int j=0;j<num;j++) {
					ans += arr[i][startnum+j];
				}
				num+=2;
				startnum-=1;
			}
			for(int i=n/2;i<n;i++) {

				for(int j=0;j<num;j++) {
					ans += arr[i][startnum+j];
				}
				num-=2;
				startnum+=1;
			}
			
			System.out.println("#"+test_case+" "+ans);

		}

	}

}
