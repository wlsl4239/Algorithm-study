//#437-C

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int arr[1010];

int main()
{
	int n,m;
	cin>>n>>m;
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		cin>>arr[i];
	}
	for(int i=0;i<m;i++)
	{
		int a,b;
		cin>>a>>b;
		if(arr[a]<arr[b])
		{
			sum += arr[a];
		}
		else
		{
			sum += arr[b];
		}
	}
	cout<<sum<<endl;

}
