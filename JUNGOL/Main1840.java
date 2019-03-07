import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static class node{
		int y;
		int x;
		node(int y,int x){
			this.y = y;
			this.x = x;
		}
	}
	static int cheese(int[][] arr) {
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				if(arr[i][j]!=0) cnt++;
		return cnt;
	}
	static boolean melted(int[][] arr) {
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				if(arr[i][j]!=0) return false;
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int[][] arr = new int [n][m];
		
		for(int i=0;i<n;i++) {
			s = br.readLine().split(" ");
			for(int j=0;j<m;j++) 
				arr[i][j] = Integer.parseInt(s[j]);
		}
		int ans = cheese(arr);
		int day = 0;
		while(true) {
			
			Queue<node> q = new LinkedList<>();
			boolean[][] visited = new boolean[n][m];
			boolean[][] melting = new boolean[n][m];
			q.add(new node(0,0));
			
			while(!q.isEmpty()) {
				node now = q.poll();
				
				if(arr[now.y][now.x]!=0) {
					melting[now.y][now.x] = true;
					continue;
				}
					
				
				for(int i=0;i<4;i++) {
					int nextx = now.x+dx[i];
					int nexty = now.y+dy[i];
					if(nextx>=0 && nextx<m && nexty>=0 && nexty<n && !visited[nexty][nextx]) {
						visited[nexty][nextx] = true;
						q.add(new node(nexty,nextx));
					}					
				}				
			}
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					if(melting[i][j])
						arr[i][j] = 0;
			
			day++;
			if(melted(arr)) break;
			ans = cheese(arr);
		}
		
		System.out.println(day+"\n"+ans);
	}
}
