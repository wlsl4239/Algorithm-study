/**
 * Q) N2개의 방이 N×N형태로 늘어서 있다.
 * 위에서 i번째 줄의 왼쪽에서 j번째 방에는 1이상 N2 이하의 수 Ai,j가 적혀 있으며, 이 숫자는 모든 방에 대해 서로 다르다.
 * 당신이 어떤 방에 있다면, 상하좌우에 있는 다른 방으로 이동할 수 있다.
 * 물론 이동하려는 방이 존재해야 하고, 이동하려는 방에 적힌 숫자가 현재 방에 적힌 숫자보다 정확히 1 더 커야 한다.
 * 처음 어떤 수가 적힌 방에서 있어야 가장 많은 개수의 방을 이동할 수 있는지 구하는 프로그램을 작성하라.
 * 
 * [입력]
 * 첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
 * 각 테스트 케이스의 첫 번째 줄에는 하나의 정수 N (1 ≤ N ≤ 103)이 주어진다.
 * 다음 N개의 줄에는 i번째 줄에는 N개의 정수 Ai, 1, … , Ai, N (1 ≤ Ai, j ≤ N2) 이 공백 하나로 구분되어 주어진다.
 * Ai, j는 모두 서로 다른 수이다.
 * 
 * [출력]
 * 각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고,
 * 한 칸을 띄운 후, 처음에 출발해야 하는 방 번호와 최대 몇 개의 방을 이동할 수 있는지를 공백으로 구분하여 출력한다.
 * 이동할 수 있는 방의 개수가 최대인 방이 여럿이라면 그 중에서 적힌 수가 가장 작은 것을 출력한다.
 * 
 * [Solution]
 * n*n의 모든 점에서 dfs 혹은 bfs를 수행, 인접 노드에 갈 수 없다면 현재 깊이를 ans와 비교해서 더 큰 값으로 최신화한다.
 * 수행 후 ans를 출력한다.
 * */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int[] dy = {1,0,-1,0};
	static int[] dx = {0,1,0,-1};	
	static class node{
		int y,x,starti,startj,n;
		node(int y,int x,int starti,int startj,int n){
			this.y = y;
			this.x = x;
			this.starti = starti;
			this.startj = startj;
			this.n = n;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			int [][] arr = new int [n][n];
			int ans = 0;
			int ansstart = 100000;
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				for(int j=0;j<n;j++)
					arr[i][j] = Integer.parseInt(s[j]);
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					Queue<node> q = new LinkedList<>();
					q.add(new node(i,j,i,j,1));
					
					while(!q.isEmpty()) {
						node now = q.poll();						
						if(ans<now.n) {
							ans = now.n;
							ansstart = arr[now.starti][now.startj];
						}
						if(ans==now.n)
							ansstart = Math.min(ansstart, arr[now.starti][now.startj]);
						
						for(int d=0;d<4;d++) {
							int nexty = now.y+dy[d];
							int nextx = now.x+dx[d];							
							if(nexty>=0 && nexty<n && nextx>=0 && nextx<n && 
							   arr[now.y][now.x]+1 == arr[nexty][nextx] ) {
								q.add(new node(nexty,nextx,now.starti,now.startj,now.n+1));
							}
						}						
					}
				}
			}
			System.out.println("#" + test + " "+ansstart+" "+ans);
		}
	}
}
