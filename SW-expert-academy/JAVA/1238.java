import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test=1;test<=10;test++) {
			
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int start = Integer.parseInt(s[1]);
			
			boolean [][] arr = new boolean [n+1][n+1];
			int [] cnt = new int [n+1];
			
			s = br.readLine().split(" ");
			for(int i=0;i<n;i+=2) 
				arr[Integer.parseInt(s[i])][Integer.parseInt(s[i+1])] = true;
			
			cnt[start] = 1;
			Queue<Integer> q = new LinkedList<>();
			q.add(start);
			
			
			while(!q.isEmpty()) {
				int now = q.poll();
				
				for(int i=1;i<=n;i++) {
					if(arr[now][i] && cnt[i]==0) {
						q.add(i);
						cnt[i] = cnt[now]+1;
					}					
				}				
			}
			int max = 0;
			int ans = 0;
			
			for(int i=0;i<n;i++) {
				if(cnt[i] > max) {
					max = cnt[i];
					ans = i;
				}
				else if(cnt[i] == max)
					ans = i;
			}
			
			System.out.println("#"+test+" "+ans);
		}
	}
}
