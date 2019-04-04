import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	
	static int s,t,a,b;
	static int ans;
	
	static void dfs(int now,int day) {
		if(now > t) return;
		if(now == t) {
			ans = Math.min(ans, day);
			return;
		}
		
		dfs(now+a,day+1);
		dfs(now*b,day+1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=T;test++) {
			String[] ss = br.readLine().split(" ");
			ans = Integer.MAX_VALUE;
			s = Integer.parseInt(ss[0]);
			t = Integer.parseInt(ss[1]);
			a = Integer.parseInt(ss[2]);
			b = Integer.parseInt(ss[3]);
			
			dfs(s,0);
			if(ans==Integer.MAX_VALUE) ans = -1;
			System.out.println("#"+test+" "+ans);
			
		}
	}
}
