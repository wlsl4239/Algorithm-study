import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int [100000][2];		//num (0,1) -> (p,q)
		int[][] map = new int [300][300];
		int cnt = 1;
		
		for(int i=2;i<300;i++) {
			int p = 1;
			int q = i-1;
			while(q>=1) {
				map[p][q] = cnt;
				arr[cnt][0] = p;
				arr[cnt][1] = q;
				cnt++;
				p++;
				q--;
			}
		}
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int test=1;test<=t;test++) {
			String[] s = br.readLine().split(" ");
			int p = Integer.parseInt(s[0]);
			int q = Integer.parseInt(s[1]);
			
			System.out.println("#" + test + " " + map[arr[p][0] + arr[q][0]][arr[p][1] + arr[q][1]]);			
		}
		br.close();
	}
}
