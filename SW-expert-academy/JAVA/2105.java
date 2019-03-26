import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int n,ans,starty,startx;
	static int[][] arr;
	static boolean[] visited;
	static int[] dy = {-1,-1, 1, 1};
	static int[] dx = {-1, 1,-1, 1};	

	static void dfs(int y,int x,int len,int dir,int cnt) {
		if(cnt>4) return;
		visited[arr[y][x]] = true;

		for(int i=0;i<4;i++) {
			int nexty = y+dy[i];
			int nextx = x+dx[i];
			if(nextx==startx && nexty==starty && len>=4 && cnt>=3)
			{ 
				ans = Math.max(ans,len);
				visited[arr[y][x]]=false;
				return;
			}
			if(nextx<0 || nextx>=n || nexty<0 || nexty>=n || visited[arr[nexty][nextx]])
				continue;

			if(i==dir) dfs(nexty,nextx,len+1,i,cnt);
			else dfs(nexty,nextx,len+1,i,cnt+1);
		}
		visited[arr[y][x]] = false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine().trim());

		for(int test=1;test<=t;test++) {
			n = Integer.parseInt(br.readLine().trim()); 
			arr = new int [n][n];
			visited = new boolean[101];
			ans = -1;
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				for(int j=0;j<n;j++) {
					arr[i][j] = Integer.parseInt(s[j]);
				}
			}

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					starty = i;
					startx = j;
					dfs(i,j,1,-1,0);
				}
			}
			System.out.println("#"+test+" "+ans);
		}
	}
}
