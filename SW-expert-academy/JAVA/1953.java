import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int n,m,r,c,l;
	static class Node{
		int y,x,time,type;
		public Node(int y, int x, int time, int type) {
			super();
			this.y = y;
			this.x = x;
			this.time = time;
			this.type = type;
		}
	}
	static boolean movable(int y,int x) {
		return (y>=0 && y<n && x>=0 && x<m);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			n = Integer.parseInt(s[0]);
			m = Integer.parseInt(s[1]);
			r = Integer.parseInt(s[2]);
			c = Integer.parseInt(s[3]);
			l = Integer.parseInt(s[4]);
			
			int [][] arr = new int [n+1][m+1];
			boolean[][] visited = new boolean[n+1][m+1];
			
			for(int i=0;i<n;i++) {
				s = br.readLine().split(" ");
				for(int j=0;j<m;j++)
					arr[i][j] = Integer.parseInt(s[j]);
			}			
			int ans = 1;
			Queue<Node> q = new LinkedList<>();
			q.add(new Node(r,c,1,arr[r][c]));
			visited[r][c] = true;
			
			while(!q.isEmpty()) {
				Node now = q.poll();
				switch(now.type) {
				case 1:
					if(movable(now.y+1,now.x) && !visited[now.y+1][now.x] && now.time<l 
							&& (arr[now.y+1][now.x]==1 || arr[now.y+1][now.x]==2 || arr[now.y+1][now.x]==4 || arr[now.y+1][now.x]==7)) {
						q.add(new Node(now.y+1,now.x,now.time+1,arr[now.y+1][now.x]));
						visited[now.y+1][now.x] = true;
						ans++;
					}
					if(movable(now.y-1,now.x) && !visited[now.y-1][now.x] && now.time<l 
							&& (arr[now.y-1][now.x]==1 || arr[now.y-1][now.x]==2 || arr[now.y-1][now.x]==5 || arr[now.y-1][now.x]==6)) {
						q.add(new Node(now.y-1,now.x,now.time+1,arr[now.y-1][now.x]));
						visited[now.y-1][now.x] = true;
						ans++;
					}
					if(movable(now.y,now.x+1) && !visited[now.y][now.x+1] && now.time<l
							&& (arr[now.y][now.x+1]==1 || arr[now.y][now.x+1]==3 || arr[now.y][now.x+1]==6 || arr[now.y][now.x+1]==7)) {
						q.add(new Node(now.y,now.x+1,now.time+1,arr[now.y][now.x+1]));
						visited[now.y][now.x+1] = true;
						ans++;
					}
					if(movable(now.y,now.x-1) && !visited[now.y][now.x-1] && now.time<l
							&& (arr[now.y][now.x-1]==1 || arr[now.y][now.x-1]==3 || arr[now.y][now.x-1]==4 || arr[now.y][now.x-1]==5)) {
						q.add(new Node(now.y,now.x-1,now.time+1,arr[now.y][now.x-1]));
						visited[now.y][now.x-1] = true;
						ans++;
					}
					break;
				case 2:
					if(movable(now.y+1,now.x) && !visited[now.y+1][now.x] && now.time<l 
							&& (arr[now.y+1][now.x]==1 || arr[now.y+1][now.x]==2 || arr[now.y+1][now.x]==4 || arr[now.y+1][now.x]==7)) {
						q.add(new Node(now.y+1,now.x,now.time+1,arr[now.y+1][now.x]));
						visited[now.y+1][now.x] = true;
						ans++;
					}
					if(movable(now.y-1,now.x) && !visited[now.y-1][now.x] && now.time<l 
							&& (arr[now.y-1][now.x]==1 || arr[now.y-1][now.x]==2 || arr[now.y-1][now.x]==5 || arr[now.y-1][now.x]==6)) {
						q.add(new Node(now.y-1,now.x,now.time+1,arr[now.y-1][now.x]));
						visited[now.y-1][now.x] = true;
						ans++;
					}
					
					break;
				case 3:
					if(movable(now.y,now.x+1) && !visited[now.y][now.x+1] && now.time<l
							&& (arr[now.y][now.x+1]==1 || arr[now.y][now.x+1]==3 || arr[now.y][now.x+1]==6 || arr[now.y][now.x+1]==7)) {
						q.add(new Node(now.y,now.x+1,now.time+1,arr[now.y][now.x+1]));
						visited[now.y][now.x+1] = true;
						ans++;
					}
					if(movable(now.y,now.x-1) && !visited[now.y][now.x-1] && now.time<l
							&& (arr[now.y][now.x-1]==1 || arr[now.y][now.x-1]==3 || arr[now.y][now.x-1]==4 || arr[now.y][now.x-1]==5)) {
						q.add(new Node(now.y,now.x-1,now.time+1,arr[now.y][now.x-1]));
						visited[now.y][now.x-1] = true;
						ans++;
					}
					break;
				case 4:
					if(movable(now.y-1,now.x) && !visited[now.y-1][now.x] && now.time<l 
							&& (arr[now.y-1][now.x]==1 || arr[now.y-1][now.x]==2 || arr[now.y-1][now.x]==5 || arr[now.y-1][now.x]==6)) {
						q.add(new Node(now.y-1,now.x,now.time+1,arr[now.y-1][now.x]));
						visited[now.y-1][now.x] = true;
						ans++;
					}
					if(movable(now.y,now.x+1) && !visited[now.y][now.x+1] && now.time<l
							&& (arr[now.y][now.x+1]==1 || arr[now.y][now.x+1]==3 || arr[now.y][now.x+1]==6 || arr[now.y][now.x+1]==7)) {
						q.add(new Node(now.y,now.x+1,now.time+1,arr[now.y][now.x+1]));
						visited[now.y][now.x+1] = true;
						ans++;
					}
					break;
				case 5:
					if(movable(now.y+1,now.x) && !visited[now.y+1][now.x] && now.time<l && arr[now.y+1][now.x]!=0 
							&& (arr[now.y+1][now.x]==1 || arr[now.y+1][now.x]==2 || arr[now.y+1][now.x]==4 || arr[now.y+1][now.x]==7)) {
						q.add(new Node(now.y+1,now.x,now.time+1,arr[now.y+1][now.x]));
						visited[now.y+1][now.x] = true;
						ans++;
					}
					if(movable(now.y,now.x+1) && !visited[now.y][now.x+1] && now.time<l
							&& (arr[now.y][now.x+1]==1 || arr[now.y][now.x+1]==3 || arr[now.y][now.x+1]==6 || arr[now.y][now.x+1]==7)) {
						q.add(new Node(now.y,now.x+1,now.time+1,arr[now.y][now.x+1]));
						visited[now.y][now.x+1] = true;
						ans++;
					}
					
					break;
				case 6:
					if(movable(now.y+1,now.x) && !visited[now.y+1][now.x] && now.time<l && arr[now.y+1][now.x]!=0 
							&& (arr[now.y+1][now.x]==1 || arr[now.y+1][now.x]==2 || arr[now.y+1][now.x]==4 || arr[now.y+1][now.x]==7)) {
						q.add(new Node(now.y+1,now.x,now.time+1,arr[now.y+1][now.x]));
						visited[now.y+1][now.x] = true;
						ans++;
					}
					if(movable(now.y,now.x-1) && !visited[now.y][now.x-1] && now.time<l
							&& (arr[now.y][now.x-1]==1 || arr[now.y][now.x-1]==3 || arr[now.y][now.x-1]==4 || arr[now.y][now.x-1]==5)) {
						q.add(new Node(now.y,now.x-1,now.time+1,arr[now.y][now.x-1]));
						visited[now.y][now.x-1] = true;
						ans++;
					}
					
					break;
				case 7:
					if(movable(now.y-1,now.x) && !visited[now.y-1][now.x] && now.time<l 
							&& (arr[now.y-1][now.x]==1 || arr[now.y-1][now.x]==2 || arr[now.y-1][now.x]==5 || arr[now.y-1][now.x]==6)) {
						q.add(new Node(now.y-1,now.x,now.time+1,arr[now.y-1][now.x]));
						visited[now.y-1][now.x] = true;
						ans++;
					}
					if(movable(now.y,now.x-1) && !visited[now.y][now.x-1] && now.time<l
							&& (arr[now.y][now.x-1]==1 || arr[now.y][now.x-1]==3 || arr[now.y][now.x-1]==4 || arr[now.y][now.x-1]==5)) {
						q.add(new Node(now.y,now.x-1,now.time+1,arr[now.y][now.x-1]));
						visited[now.y][now.x-1] = true;
						ans++;
					}
					break;
				}
				
			}
			
			System.out.println("#"+test+" "+ans);
		}
	}
}
