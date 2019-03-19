import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static double[][] arr;
	static boolean[] visited;
	static int n;
	static double ans;
	static void dfs(int num,double percent) {
		if(percent<=ans) return;
		if(num == n) {
			ans = Math.max(percent,ans);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(visited[i]) continue;
			visited[i] = true;
			dfs(num+1,percent * arr[i][num]);
			visited[i] = false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			n = Integer.parseInt(br.readLine().trim());
			arr = new double [n][n];
			visited = new boolean[n];
			ans = 0;
			
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				for(int j=0;j<n;j++) {
					arr[i][j] = Integer.parseInt(s[j]);
					arr[i][j]/=100;
				}
			}
			dfs(0,1);
			
			System.out.printf("#%d %6f\n",test,ans*100);
			
		}
	}
}

