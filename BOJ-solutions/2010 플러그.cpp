#include <iostream>
using namespace std;

int arr[500010];
int main()
{
	int n;
	cin>>n;
	int sum = 1;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
		sum--;
		sum+=arr[i];
	}
	cout<<sum<<endl;
}
