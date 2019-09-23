//dp
#include <iostream>

using namespace std;

long long dp[25][25][25];		//n, l, r일 때 경우의 수

int main() {
	dp[1][1][1] = 1;
	for (int i = 2; i <= 20; i++) 
		for (int j = 1; j <= i; j++) 
			for (int k = 1; k <= i; k++) 
				dp[i][j][k] =	dp[i - 1][j - 1][k] +				// 1이 가장 왼쪽에 있을 때
								dp[i - 1][j][k - 1] +				// 1이 가장 오른쪽에 있을 때
								dp[i - 1][j][k] * (i - 2);			// 1이 중간에 있을 때
	int t;
	cin >> t;
	for (int test = 1; test <= t; test++) {
		int n, l, r;
		cin >> n >> l >> r;
		cout << "#" << test << " " << dp[n][l][r] << "\n";
	}
}
