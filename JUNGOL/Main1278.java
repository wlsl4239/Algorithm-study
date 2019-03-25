import java.util.Scanner;

/*
정올 보석상에 도둑이 침입했다. 도둑은 배낭에 보석을 훔치려고 한다. 이때, 훔친 보석의 무게가 W를 넘어가면 배낭이 망가진다.
각 보석의 값어치와 무게가 주어질 때, 도둑은 총 무게가 W를 넘지 않으면서 보석의 총 값어치가 최대가 되도록 보석을 배낭에 담으려고 한다. 
이때 배낭에 담을 수 있는 최대 값어치를 구하시오.

첫 줄은 보석의 가지 수 N(1≤N≤1,000)과 배낭의 용량 W(1≤W≤10,000)가 주어진다. 
둘째 줄부터 N+1줄에는 각 보석의 무게 Wi(1≤Wi≤W)와 값어치 Pi가 주어진다. (단, 각각의 보석의 개수는 무제한으로 가정한다.)

보석의 무게와 값어치가 주어질 때 총 무게가 W를 넘지 않으면서, 보석의 총 값어치가 최대가 되는 최대값을 출력한다.

최대값은 int 범위 이내이다.
 */
public class Main {
	static int n,w;
	static int[][] item;
	static int[][] dp;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		w = sc.nextInt();
		item = new int [n+1][2];
		dp = new int [n+1][w+1];
		for(int i=1;i<=n;i++) {
			item[i][0] = sc.nextInt();
			item[i][1] = sc.nextInt();
		}

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=w; j++) {
				if(j-item[i][0]<0)	dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j-item[i][0]] + item[i][1],dp[i-1][j]);

			}
		}
		System.out.println(dp[n][w]);

	}
}
