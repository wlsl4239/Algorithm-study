import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int [] month,money;
	static int ans;
	
	static void dfs(int m,int cost) {
		if(cost>=ans) return;
		
		if(m>=12) {
			ans = Math.min(ans,cost);
			return;
		}
		
		dfs(m+1,cost+money[0]*month[m]);
		dfs(m+1,cost+money[1]);
		dfs(m+3,cost+money[2]);		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			month = new int [12];
			money = new int[4];
			String[] s = br.readLine().split(" ");
			for(int i=0;i<4;i++) money[i] = Integer.parseInt(s[i]);
			s = br.readLine().split(" ");
			for(int i=0;i<12;i++) month[i] = Integer.parseInt(s[i]);
			ans = money[3];
			
			dfs(0,0);
			System.out.println("#"+test+" "+ans);
		}
	}
}
