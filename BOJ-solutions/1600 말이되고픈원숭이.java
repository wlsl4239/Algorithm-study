import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dy = { 1, 2, 2, 1,-1,-2,-2,-1,-1, 0, 1, 0};
	static int[] dx = { 2, 1,-1,-2,-2,-1, 1, 2, 0,-1, 0, 1};
	static int k;
	static int w,h;
	
	static class node{
		int y,x,n,horse;

		public node(int y, int x, int n,int horse) {
			this.y = y;
			this.x = x;
			this.n = n;
			this.horse = horse;
		}
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		k = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		w = Integer.parseInt(s[0]);
		h = Integer.parseInt(s[1]);
		int[][][] arr = new int [h+1][w+1][k+1];
		int ans = -1;
		Queue<node> q = new LinkedList<>();
		
		for(int i=0;i<h;i++) {
			s = br.readLine().split(" ");
			for(int j=0;j<w;j++) {
				arr[i][j][0] = Integer.parseInt(s[j]);
				for(int g=1;g<=k;g++)
					arr[i][j][g] = arr[i][j][0];
			}
		}
		
		q.add(new node(0,0,0,k));
		arr[0][0][0] = -1;
		while(!q.isEmpty()) {
			node now = q.remove();
			if(now.x == w-1 && now.y == h-1) {
				ans = now.n;
				break;
			}			
			for(int i=0;i<12;i++) {
				int nextx = now.x+dx[i];
				int nexty = now.y+dy[i];
				if(i<8) {
					if(nextx>=0 && nextx < w && nexty >= 0 && nexty < h &&
							now.horse>0 && arr[nexty][nextx][now.horse-1] == 0) {
						arr[nexty][nextx][now.horse-1] = -1;
						q.add(new node(nexty,nextx,now.n+1,now.horse-1));
					}
				}
				else {
					if(nextx>=0 && nextx < w && nexty >= 0 && nexty < h &&
							arr[nexty][nextx][now.horse] == 0) {
						arr[nexty][nextx][now.horse] = -1;
						q.add(new node(nexty,nextx,now.n+1,now.horse));
					}
				}
				
			}
		}
		System.out.println(ans);	
	}	
}
