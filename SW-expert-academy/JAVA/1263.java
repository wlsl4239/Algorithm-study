import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	static int INF = 10000000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for(int test=1;test<=t;test++) {
			String[] query = br.readLine().split(" ");

			int n = Integer.parseInt(query[0]);
			int [][] arr = new int [n][n];

			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++) {
					if(Integer.parseInt(query[1+i*n+j])==1)
						arr[i][j] = 1;
					else
						arr[i][j] = INF;
				}

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==j || arr[i][j]==0) continue;
					for(int k=0;k<n;k++) {
						if(i==k || arr[j][k]==0) continue;
						arr[i][k] = Math.min(arr[i][k], arr[i][j]+arr[j][k]);
					}					
				}				
			}
			int ans = INF;
			for(int[] a : arr) {
				int sum = 0;
				for(int b : a) {
					if(b!=INF)
						sum+=b;
				}
				ans = Math.min(ans, sum);
			}
			
			System.out.println("#"+test+" "+ans);
		}
	}
}

