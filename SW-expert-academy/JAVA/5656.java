import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int[][] arr;
	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};
	static int n,h,w;
	static int cnt,ans;
	static class Node{
		int y,x,n;

		public Node(int y, int x, int n) {
			super();
			this.y = y;
			this.x = x;
			this.n = n;
		}
		
		
	}
	static int count(int[][] arr) {
		int cnt = 0;
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				if(arr[i][j]!=0) cnt++;
		return cnt;
	}

	static int[][] bomb(int num, int[][] arr){
		int[][] temp = new int[h][w];
		boolean[][] visited = new boolean[h][w];
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				temp[i][j] = arr[i][j];
		
		Queue<Node> q = new LinkedList<>();
		
		for(int i=0;i<h;i++) {
			if(temp[i][num] != 0) {
				q.add(new Node(i,num,temp[i][num]));
				visited[i][num] = true;
				break;
			}			
		}
		
		while(!q.isEmpty()) {
			Node now = q.poll();
			
			temp[now.y][now.x] = 0; 
			for(int i=1;i<now.n;i++) {
				for(int j=0;j<4;j++) {
					int nexty = now.y + dy[j]*i;
					int nextx = now.x + dx[j]*i;
					
					if(nexty>=0 && nexty<h && nextx>=0 && nextx<w && !visited[nexty][nextx]) {
						q.add(new Node(nexty,nextx,temp[nexty][nextx]));
						visited[nexty][nextx] = true;
					}					
				}
			}
		}
		
		
		for(int j=0;j<w;j++) {
			for(int k=0;k<h;k++) {
				for(int i=h-1;i>0;i--) {
					if(temp[i][j] == 0) {
						temp[i][j] = temp[i-1][j];
						temp[i-1][j] = 0;
					}
				}
			}
		}
				
		
		
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int test=1;test<=t;test++) {
			n = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();

			arr = new int [h][w];

			for(int i=0;i<h;i++)
				for(int j=0;j<w;j++)
					arr[i][j] = sc.nextInt();
			ans = 100000;

			if(n==1) 
				for(int i=0;i<w;i++) 
					ans = Math.min(ans,count(bomb(i,arr)));
			
			if(n==2) 
				for(int i=0;i<w;i++) for(int j=0;j<w;j++) 
					ans = Math.min(ans,count(bomb(j,bomb(i,arr))));
			
			if(n==3) 
				for(int i=0;i<w;i++) for(int j=0;j<w;j++) for(int k=0;k<w;k++) 
					ans = Math.min(ans,count(bomb(k,bomb(j,bomb(i,arr)))));
			
			if(n==4) 
				for(int i=0;i<w;i++) for(int j=0;j<w;j++) for(int k=0;k<w;k++) for(int l=0;l<w;l++) 
					ans = Math.min(ans,count(bomb(l,bomb(k,bomb(j,bomb(i,arr))))));
				
			System.out.println("#"+test+" "+ans);
			
			
		}
	}
}


