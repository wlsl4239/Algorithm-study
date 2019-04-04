import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};
	
	static class Fire{
		int y,x,n;
		public Fire(int y, int x, int n) {
			super();
			this.y = y;
			this.x = x;
			this.n = n;
		}
	}
	static class Node{
		int y,x,n;
		public Node(int y, int x, int n) {
			super();
			this.y = y;
			this.x = x;
			this.n = n;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		char[][] arr = new char[r][c];
		
		Queue<Fire> fire = new LinkedList<>();
		Queue<Node> human = new LinkedList<>();
		
		for(int i=0;i<r;i++) {
			String s = br.readLine().trim();
			for(int j=0;j<c;j++) {
				arr[i][j] = s.charAt(j);
				if(arr[i][j] == '*') fire.add(new Fire(i,j,0));				
				if(arr[i][j] == 'S') human.add(new Node(i,j,0));
			}
		}
		
		int stop = 1;
		int ans = 100000000;
		loop : while(true) {
			if(human.isEmpty()) break;
			while(!fire.isEmpty()) {
				Fire now = fire.peek();
				if(stop == now.n) break;
				fire.poll();
				
				for(int i=0;i<4;i++) {
					int nexty = now.y + dy[i];
					int nextx = now.x + dx[i];
					
					if( nexty>=0 && nexty<r && nextx>=0 && nextx<c &&
						arr[nexty][nextx]!='*' && arr[nexty][nextx] !='X' && arr[nexty][nextx] != 'D') {
						arr[nexty][nextx] = '*';
						fire.add(new Fire(nexty,nextx,now.n + 1));
					}						
				}			
			}
			while(!human.isEmpty()) {
				Node now = human.peek();
				if(stop == now.n) {
					stop++;
					break;
				}
				human.poll();
				for(int i=0;i<4;i++) {
					int nexty = now.y + dy[i];
					int nextx = now.x + dx[i];
					
					if( nexty>=0 && nexty<r && nextx>=0 && nextx<c &&
						arr[nexty][nextx]!='*' && arr[nexty][nextx] !='X' && arr[nexty][nextx] != 'H') {
						human.add(new Node(nexty,nextx,now.n + 1));
						if(arr[nexty][nextx] == 'D') {
							ans = now.n+1;
							break loop;
						}
						arr[nexty][nextx] = 'H';
					}						
				}
			}
		}
		
		if(ans == 100000000) System.out.println("impossible");
		else System.out.println(ans);

		
		
	}
}
