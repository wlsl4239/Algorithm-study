import java.util.Scanner;

public class Main {
	static int n,ans;
	static int[][] arr;
	static boolean[] visited;
	static void dfs(int now,int cnt,int num) {
		if(num>=ans) return;
		if(cnt==n && now == 1) {
			ans = Math.min(ans, num);
			return;
		}
		
		for(int i=1;i<=n;i++) {
			if(visited[i]) continue;
			if(arr[now][i]==0) continue;
			
			visited[i] = true;
			dfs(i,cnt+1,num+arr[now][i]);
			visited[i] = false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		ans = Integer.MAX_VALUE;
		n = sc.nextInt();
		arr = new int [n+1][n+1];
		visited = new boolean[n+1];
		for(int i=1;i<=n;i++) 
			for(int j=1;j<=n;j++)
				arr[i][j] = sc.nextInt();
		
		dfs(1,0,0);
		System.out.println(ans);
		
	}
}

/*
5 
0 14 4 10 20 
14 0 7 8 7 
4 5 0 7 16 
11 7 9 0 2 
18 7 17 4 0


30
*/
