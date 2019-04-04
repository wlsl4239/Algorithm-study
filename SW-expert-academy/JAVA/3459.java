import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int ans = 0;
			long n = Long.parseLong(br.readLine().trim());
			String [] s = {"Bob","Alice"};
			
			if(n==1) {
				System.out.println("#"+test+" "+s[ans]);
				continue;
			}

			long num = 1;
			long a = 4;
		
			while(true) {
				if(num+1 <= n && num+a >= n) {
					ans = 1; break;
				}
				num+=a;
				if(num+1 <= n && num+a >= n) {
					ans = 0; break;
				}
				num+=a;
				a*=4;
				
			}
			System.out.println("#"+test+" "+s[ans]);
			
		}
	}
}
