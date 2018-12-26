#include <iostream>

using namespace std;

long long DP[110];

int main()
{
	long long n;
	int t;

	DP[0] = 0;
	DP[1] = DP[2] = DP[3] = 1;
	DP[4] = DP[5] = 2;
	DP[6] = 3;
	DP[7] = 4;
	DP[8] = 5;
	for(int i=9;i<101;i++)
	{
		DP[i] = DP[i-1] + DP[i-5];
	}
	cin>>t;
	while(t--)
	{

	cin>>n;

	cout<< DP[n] <<endl;
	}
}
