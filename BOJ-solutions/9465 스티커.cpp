#include <cstdio>
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int DP[2][100001];
int sti[2][100001];

int main()
{
	int t;
	int n;

	scanf("%d",&t);
	while(t--)
	{
		scanf("%d",&n);

		for(int i=0;i<n;i++)
		{
			scanf("%d",&sti[0][i]);
		}
		for(int i=0;i<n;i++)
		{
			scanf("%d",&sti[1][i]);
		}

		DP[0][0] = sti[0][0];
		DP[1][0] = sti[1][0];
		DP[0][1] = DP[1][0] + sti[0][1];
		DP[1][1] = DP[0][0] + sti[1][1];

		for(int i=2;i<n;i++)
		{
			DP[0][i] = max(DP[1][i-1], DP[1][i-2]) + sti[0][i];
			DP[1][i] = max(DP[0][i-1], DP[0][i-2]) + sti[1][i];
		}
		int maxscore = max(DP[0][n-1],DP[1][n-1]);
		printf("%d\n",maxscore);
	}


}
