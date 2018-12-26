#include <iostream>

using namespace std;

long long DP[110];


int main()
{
	long long n;

	DP[0] = 0;
	DP[1] = DP[2] = 1;
	for(int i=3;i<101;i++)
	{
		DP[i] = DP[i-1] + DP[i-2];
	}
	cin>>n;

	cout<< DP[n] <<endl;
}
