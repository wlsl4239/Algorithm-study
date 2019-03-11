import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	static int n;
	static int [] color;
	static int [][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine().trim());

		for(int test=1;test<=t;test++) {
			n = Integer.parseInt(br.readLine().trim());
			color = new int [n];
			map = new int [n][n];
			int ans = 0;

			String[] s = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				color[i] = Integer.parseInt(s[i]);

			for(int i=0;i<n;i++) {
				s = br.readLine().split(" ");
				for(int j=0;j<n;j++) {
					map[i][j] = Integer.parseInt(s[j]);
					if(map[i][j] == 1 && color[i] == color[j]){
						color[j] *= 10;
						ans++;
					}
				}
			}
			System.out.println("#" + test + " " + ans);
		}
	}
}
