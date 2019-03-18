import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			StringBuilder a = new StringBuilder(s[0]);
			String b = s[1];

			int cnt = 0;
			
			for(int i=0;i<a.length()-b.length()+1;i++) { 
				if(a.substring(i, i+b.length()).equals(b)) {
					cnt++;
					for(int j=i;j<i+b.length();j++)
						a.setCharAt(j, '.');
				}
			}
			int ans = a.length();
			
			ans -= cnt * (b.length()-1);
			
			System.out.println("#"+test+" "+ans);
		}
	}
}
