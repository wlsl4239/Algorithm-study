import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine().trim());

		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			long maxtime = 0;
			int[] time = new int[n];
			for(int i=0;i<n;i++) {
				time[i] = Integer.parseInt(br.readLine().trim());
				maxtime = Math.max(maxtime, time[i]);
			}

			long time1 = 0;
			long time2 = maxtime * m;
			long ans = maxtime * m;
			long mid;

			while (time1 <= time2){
				mid = (time1 + time2) / 2;
				long answer = 0;

				for (int i = 0; i < n; i++)
					answer += (mid / time[i]);

				if (answer < m)
					time1 = mid + 1;

				else {
					ans = Math.min(ans, mid);
					time2 = mid - 1;
				}
			}
			System.out.println("#"+test+" "+ans);
		}
	}
}
