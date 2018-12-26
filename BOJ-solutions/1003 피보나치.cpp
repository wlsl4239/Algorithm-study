#include <iostream>
using namespace std;

int callzero[41];
int callone[41];

int main()
{
	callzero[0] = 1;
	callzero[1] = 0;
	callone[0] = 0;
	callone[1] = 1;

	for(int i=2;i<=40;i++)
	{
		callzero[i] = callzero[i-1] + callzero[i-2];
		callone[i] = callone[i-1] + callone[i-2];
	}

	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;

		cout<<callzero[n]<<" "<<callone[n]<<endl;
	}	
}
