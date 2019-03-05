import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		for(int test=1;test<=t;test++) {
			int n = Integer.parseInt(br.readLine().trim());
			int[] arr = new int [n];
			boolean[] arr2 = new boolean[10101];
			String[] s = br.readLine().split(" ");			
			
			for(int i=0;i<n;i++) arr[i] = Integer.parseInt(s[i]);
			
			arr2[0] = true;
			
			for(int i=0;i<n;i++) for(int j=10000;j>=0;j--) if(arr2[j]) arr2[j+arr[i]] = true;
			
			int ans = 0;
			for(int i=0;i<10001;i++) if(arr2[i]) ans++;
			System.out.println("#"+test+" "+ans);			
		}		
	}
}
