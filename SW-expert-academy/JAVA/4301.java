import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		boolean[][] arr = new boolean[1001][1001];
		
		for(int i=0;i<1001;i+=4) {
			for(int j=0;j<1001;j+=4) {
				arr[i][j] = true;
				if(i+1<1001) arr[i+1][j] = true;
				if(j+1<1001) arr[i][j+1] = true;
				if(j+1<1001 && i+1<1001) arr[i+1][j+1] = true;
			}
		}
		for(int i=2;i<1001;i+=4) {
			for(int j=2;j<1001;j+=4) {
				arr[i][j] = true;
				if(i+1<1001) arr[i+1][j] = true;
				if(j+1<1001) arr[i][j+1] = true;
				if(j+1<1001 && i+1<1001) arr[i+1][j+1] = true;
			}
		}		
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int ans = 0;
			
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					if(arr[i][j]) ans++;
			
			System.out.println("#"+test+" "+ans);
		}
	}
}
