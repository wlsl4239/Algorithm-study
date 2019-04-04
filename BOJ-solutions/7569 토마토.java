import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dx = { 1, 0,-1, 0, 0, 0};
	static int[] dy = { 0, 1, 0,-1, 0, 0};
	static int[] dz = { 0, 0, 0, 0, 1,-1};

	static class node{
		int x,y,z,n;
		node(int y,int x,int z,int n){
			this.y = y;
			this.x = x;
			this.z = z;
			this.n = n;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();	//가로
		int n = sc.nextInt();	//세로
		int h = sc.nextInt();	//높이
		int ans = 0;
		int[][][] arr = new int[n][m][h];

		Queue<node> q = new LinkedList<>();

		for(int k=0;k<h;k++) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
					arr[i][j][k] =sc.nextInt();
					if(arr[i][j][k] == 1) {
						q.add(new node(i,j,k,0));
					}
				}
			}
		}
		while(!q.isEmpty()) {
			node now = q.remove();
            
			for(int i=0;i<6;i++) {
				int nextx = now.x+dx[i];
				int nexty = now.y+dy[i];
				int nextz = now.z+dz[i];
				
				ans = Math.max(ans, now.n);
				if(nextx>=0 && nextx<m && nexty>=0 && nexty<n && nextz>=0 && nextz<h && arr[nexty][nextx][nextz]==0) {
					q.add(new node(nexty,nextx,nextz,now.n+1));
					arr[nexty][nextx][nextz] = 1;

				}
			}		
		}
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++) 
				for(int k=0;k<h;k++)
					if(arr[i][j][k] == 0) 
						ans = -1;

		System.out.println(ans);
	}
}


