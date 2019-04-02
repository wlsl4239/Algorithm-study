import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static class Node{
		int x,y,range,num;
		public Node(int x, int y,int range, int num) {
			this.x = x;
			this.y = y;
			this.range = range;
			this.num = num;
		}
	}
	static int M,A,ax,ay,bx,by;
	static int[] ma,mb;
	static int[][] map;
	static int[] dy = {0,-1,0,1,0};
	static int[] dx = {0,0,1,0,-1};
	static int ans;
	static Node[] BCs;
	
	static int checkPoint(int axx, int ayy, int bxx, int byy){
	    int [] possibleA = new int[A];
	    int [] possibleB = new int[A];
	    
	    for(int i = 0; i < A; i++){
	        int distA = Math.abs(BCs[i].x - axx) + Math.abs(BCs[i].y - ayy);
	        int distB = Math.abs(BCs[i].x - bxx) + Math.abs(BCs[i].y - byy);
	        if(distA <= BCs[i].range) 
	        	possibleA[i] = BCs[i].num;
	        if(distB <= BCs[i].range) 
	        	possibleB[i] = BCs[i].num;
	    }
	    int sum = 0;
	    for(int i = 0; i < A; i++){
	        for(int j = 0; j < A; j++){
	            if(i == j){
	                sum = Math.max(sum, possibleA[i]);
	                sum = Math.max(sum, possibleB[i]);
	            }else{
	                sum = Math.max(sum , possibleA[i] + possibleB[j]);
	            }
	        }
	    }
	    return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			A = Integer.parseInt(st.nextToken());
			map = new int [11][11];
			ma = new int[M];
			mb = new int[M];
			BCs = new Node[A];
			ax = 1; ay = 1;
			bx = 10; by = 10;
			ans = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++)
				ma[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++)
				mb[i] = Integer.parseInt(st.nextToken());
			
			for(int i=0;i<A;i++) {
				st = new StringTokenizer(br.readLine());
				BCs[i] = new Node( Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}
			
			ans += checkPoint(ax,ay,bx,by);
			for(int i=0;i<M;i++) {
				ay += dy[ma[i]]; ax += dx[ma[i]]; 
				by += dy[mb[i]]; bx += dx[mb[i]];
				ans += checkPoint(ax,ay,bx,by);
			}
			
			System.out.println("#"+test+" "+ans);
		}
	}
}
