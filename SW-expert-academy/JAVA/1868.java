import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static class node{
		int y;
		int x;
		node(int y,int x){
			this.y = y;
			this.x = x;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());

		int[] dy = { 1, 1, 1, 0, 0,-1,-1,-1};
		int[] dx = { 1, 0,-1, 1,-1, 1, 0,-1};

		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());

			int[][] arr = new int[n][n];
			boolean[][] visited = new boolean[n][n];
			Queue<node> q = new LinkedList<>();
			int ans = 0;

			for(int i=0;i<n;i++) {
				String s = br.readLine();
				for(int j=0;j<n;j++) {
					if(s.charAt(j) == '.')
						arr[i][j] = 0;
					else
						arr[i][j] = -1;
				}
			}

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j] == -1) continue;
					int cnt = 0;
					for(int k=0;k<8;k++) {
						int nx = j+dx[k];
						int ny = i+dy[k];
						if(nx>=0 && nx<n && ny>=0 && ny<n && arr[ny][nx] == -1)
							cnt++;
					}
					arr[i][j] = cnt;					
				}
			}

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(!visited[i][j] && arr[i][j] == 0) {
						q.add(new node(i,j));
						visited[i][j] = true;
						ans++;
						while(!q.isEmpty()) {
							node now = q.remove();
							if(arr[now.y][now.x]!= 0)
								continue;

							for(int k=0;k<8;k++) {
								int nx = now.x+dx[k];
								int ny = now.y+dy[k];
								if(nx>=0 && nx<n && ny>=0 && ny<n && !visited[ny][nx] && arr[ny][nx] != -1) {
									visited[ny][nx] = true;
									q.add(new node(ny,nx));
								}
							}
						}
					}
				}
			}
			for(int i=0;i<n;i++) 
				for(int j=0;j<n;j++)
					if(!visited[i][j] && arr[i][j]!=-1)
						ans++;

			System.out.println("#"+test+" "+ans);

		}
	}
}
