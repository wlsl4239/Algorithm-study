import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			char[][] arr = new char[n][n];
			int[][] bnum = new int[n][n];
			int ans = 0;
			for(int i=0;i<n;i++) {
				String s = sc.next();
				for(int j=0;j<n;j++)
					arr[i][j] = s.charAt(j);
			}

			for(int i=0;i<n;i++) {
				int vcnt = 0;
				int hcnt = 0;
				for(int j=0;j<n;j++) {
					if(arr[i][j] == 'B')
						vcnt++;
					if(arr[j][i] == 'B')
						hcnt++;
				}
				for(int j=0;j<n;j++) {
					bnum[i][j] += vcnt;
					bnum[j][i] += hcnt;
				}
			}
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++) {
					if(arr[i][j] == 'B')
						bnum[i][j]--;

					if(bnum[i][j]%2 == 1)
						ans++;
				}
			

			System.out.println("#" + test + " " + ans);
		}
	}
}
