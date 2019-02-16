import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	static int[][] arr=new int[4][4];
	static int[] dx= {1,0,-1,0};
	static int[] dy= {0,1,0,-1};
	static HashSet<String> list; 
	
	static void dfs(int y,int x,int n,String s) {
		if(n==7) {
			list.add(s);
			return;
		}
		
		for(int i=0;i<4;i++) {
			int nextX=x+dx[i];
			int nextY=y+dy[i];
			
			if(nextX>=0 && nextX<4 && nextY>=0 && nextY<4)
				dfs(nextY,nextX,n+1,s+arr[nextY][nextX]);
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			list = new HashSet<>();
					
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arr[i][j]=sc.nextInt();
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					dfs(i,j,1,""+arr[i][j]);
			
			System.out.println("#"+test+" "+list.size());
		}
	}
}

/*
1
1 1 1 1
1 1 1 2
1 1 2 1
1 1 1 1
 */
