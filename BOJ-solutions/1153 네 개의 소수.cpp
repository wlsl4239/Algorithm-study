#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int prime[1000010];
int n;
vector <int> pv;
int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif

	int k=0;
	cin>>n;
	for(int i=1;i<=n;i++)
		for(int j=i;j<n;j+=i)
			prime[j]++;
	for(int i=1;i<=n;i++)
		if(prime[i] == 2)
			pv.push_back(i);

	if(n<8)
		cout<<-1<<endl;
	else
	{
		if(n%2 == 0)
		{
			n -= 4;
			cout<<"2 2 ";
		}
		else
		{
			n -= 5;
			cout<<"2 3 ";
		}
	

	for(int i=0;i<pv.size();i++)
	{
		int k=pv[i];
		if(binary_search(pv.begin(),pv.end(),n-k))
		{	cout<<k<<" "<<n-k<<endl;
		break;
		}
	}
	}
}
