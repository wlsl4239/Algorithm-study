/**

[풀이]
"벡터의 합"의 크기가 최소인 경우를 출력하는 문제이다.
"벡터의 합"이라는건 (x2-x1 , y2-y1)의 합이고, 모든 쌍이 존재하므로 출발점 n/2개, 도착점 n/2개로 볼 수 있다.

즉 벡터의 합은 (도착점의 x좌표의 합 - 시작점의 x좌표의 합 , 도착점의 y좌표의 합 - 시작점의 y좌표의 합) 으로 나타난다.
n개의 입력값을 출발점과 도착점으로 나누어 벡터의 합을 구한 뒤 최솟값으로 최신화 해주면 해결된다.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1494_ {
	static int[][] worm;
	static boolean[] visited;
	static long ans;
	static int n;
	
	static void dfs(int now,int cnt) {
		if(cnt == n/2) {
			long x = 0; long y = 0;
			for(int i=0;i<n;i++) {
				if(visited[i]) {
					x += worm[i][0];
					y += worm[i][1];
				}
				else {
					x -= worm[i][0];
					y -= worm[i][1];					
				}
			}
			ans = Math.min(ans, x*x+y*y);
			return;
		}
		
		for(int i=now;i<n;i++) {
			if(visited[i]) continue;
			
			visited[i] = true;
			dfs(i+1,cnt+1);
			visited[i] = false;			
		}		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			n = Integer.parseInt(br.readLine().trim());
			
			worm = new int [n][2];
			visited = new boolean[n];
			ans = Long.MAX_VALUE;
			
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				worm[i][0] = Integer.parseInt(s[0]);
				worm[i][1] = Integer.parseInt(s[1]);
			}
			
			dfs(0,0);
			
			System.out.println("#"+test+" "+ans);
		}
	}
}
