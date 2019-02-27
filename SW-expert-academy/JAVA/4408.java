import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			int ans = 0;
			int[] corri = new int[201];
			for(int i=0;i<n;i++) {
				String[] s = br.readLine().split(" ");
				int a = Integer.parseInt(s[0].trim());
				int b = Integer.parseInt(s[1].trim());
				if(a%2==1) a++;
				if(b%2==1) b++;
				if(a>b) {
					int temp=a;
					a=b;
					b=temp;
				}
				for(int j=a/2;j<=b/2;j++) 
					corri[j]++;
			}
			
			for(int i=1;i<corri.length;i++)
				ans = Math.max(ans,corri[i]);
			
			System.out.println("#"+test+" "+ans);
			
		}
	}
}
