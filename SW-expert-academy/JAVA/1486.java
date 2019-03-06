import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			int[] arr = new int[n];
			boolean[] top = new boolean[200010];
			s = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(s[i]);
			
			top[0] = true;
			for(int i=0;i<n;i++) {
				for(int j=200001;j>=0;j--) {
					if(top[j]) top[j+arr[i]] = true;
				}
			}
			for(int i=b;i<200001;i++)
				if(top[i]) {
					System.out.println("#"+test+" "+(i-b));
					break;
				}
		}
	}
}
