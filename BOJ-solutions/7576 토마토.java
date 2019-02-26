import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	static class node{
		int x,y,n;
		node(int y,int x,int n){
			this.x = x;
			this.y = y;
			this.n = n;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();	//가로
		int n = sc.nextInt();	//세로
		int ans = 0;
		int[][] arr = new int[n][m];
		
		Queue<node> q = new LinkedList();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] =sc.nextInt();
				if(arr[i][j] == 1) {
					q.add(new node(i,j,0));
				}
			}
		}
		while(!q.isEmpty()) {
			node now = q.remove();
			
			for(int i=0;i<4;i++) {
				int nextx = now.x+dx[i];
				int nexty = now.y+dy[i];
				ans = Math.max(ans, now.n);
				if(nextx>=0 && nextx<m &&nexty>=0 && nexty<n && arr[nexty][nextx]==0) {
					q.add(new node(nexty,nextx,now.n+1));
					arr[nexty][nextx] = 1;
					
				}
			}		
		}
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++) 
				if(arr[i][j] == 0) 
					ans = -1;
		
		System.out.println(ans);
	}
}
