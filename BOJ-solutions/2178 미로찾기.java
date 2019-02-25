import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] arr;
	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};
	
	static class Nod{
		int y;
		int x;
		Nod(int y,int x){
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n][m];
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<m;j++) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		
		Queue<Nod> q = new LinkedList<>();
		arr[0][0] = -1;
		q.add(new Nod(0,0));
		while(!q.isEmpty()) {
			Nod now = q.remove();
			for(int i=0;i<4;i++) {
				if(now.x+dx[i]>=0 && now.x+dx[i]<m && now.y+dy[i]>=0 && now.y+dy[i]<n && 
						arr[now.y+dy[i]][now.x+dx[i]]>0) {
					q.add(new Nod(now.y+dy[i],now.x+dx[i]));
					arr[now.y+dy[i]][now.x+dx[i]] = arr[now.y][now.x] - 1;
				}
			}
			
		}

		System.out.println(-arr[n-1][m-1]);
	}
}
