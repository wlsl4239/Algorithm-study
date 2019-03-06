import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Solution {
	
	static class node implements Comparable<node>{
		int x;
		int y;
		int size;
		node(int x,int y,int size){
			this.x = x;
			this.y = y;
			this.size = size;
		}
		@Override
		public int compareTo(node o) {
			if(size>o.size) return 1;
			else if(size == o.size) {
				if(y>o.y)return 1;
				else return -1;
			}
			else
				return -1;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[n][n];
			boolean[][] visited = new boolean[n][n];
			
			for(int i=0;i<n;i++){
				String[] s = br.readLine().split(" ");
				for(int j=0;j<n;j++)
					arr[i][j] = Integer.parseInt(s[j]);
			}
			
			PriorityQueue<node> pq = new PriorityQueue<>();
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(visited[i][j] || arr[i][j]==0) continue;
					
					visited[i][j] = true;
					int x = 0;
					int y = 0;
					for(int width = j; width<n; width++) {
						if(arr[i][width]==0) break;
						x++;
					}
					for(int height=i;height<n;height++) {
						if(arr[height][j]==0) break;
						y++;
					}
					
					for(int h=i;h<i+y;h++)
						for(int w=j;w<j+x;w++)
							visited[h][w] = true;
					
					pq.add(new node(x,y,x*y));			
				}
			}
			
			System.out.print("#"+test+" "+pq.size()+" ");
			while(!pq.isEmpty()) {
				node now = pq.poll();
				System.out.print(now.y+" "+now.x+" ");
			}
			System.out.println();
		}
	}
}
