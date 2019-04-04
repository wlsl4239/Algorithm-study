import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static char[][] map;
	static int ans,n,m;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	public static class node{
		int x;
		int y;
		int n;
		public node(int x, int y, int n) {
			this.x = x;
			this.y = y;
			this.n = n;
		}	
	}
	
	public static void bfs(int y,int x) {
		boolean[][] visited = new boolean[n][m];
		LinkedList<node> q = new LinkedList<node>();
		q.add(new node(x,y,0));
		while(!q.isEmpty()) {
			node cur = q.remove();
			if(!visited[cur.y][cur.x]) {
				visited[cur.y][cur.x] = true;
				
				ans = (ans<cur.n) ? cur.n : ans;
				
				for(int i=0;i<4;i++) {
					if(
							0 <=cur.x+dx[i] && 
							cur.x+dx[i] < m && 
							0 <=cur.y+dy[i] && 
							cur.y+dy[i] < n && 
							map[cur.y+dy[i]][cur.x+dx[i]] == 'L' )
					q.add(new node(cur.x+dx[i],cur.y+dy[i],cur.n+1));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		map = new char[n][m];
		for(int i=0;i<n;i++) {
			String s=sc.next();
			for(int j=0;j<m;j++)
				map[i][j] = s.charAt(j);
		}
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(map[i][j] == 'L') bfs(i,j);
		
		System.out.println(ans);
	}
}
