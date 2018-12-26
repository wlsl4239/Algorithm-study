//415-A

#include <iostream>
using namespace std;


	bool arr1[101];
	int arr[101];
int main()
{
	int n,m;

	cin>>n>>m;
	int a;
	for(int i=1;i<=m;i++)
	{
		cin>>a;
		for(int j=a;j<=n;j++)
			if(!arr1[j])
			{
				arr[j] = a;
				arr1[j] = true;
			}
	}

	for(int i=1;i<=n;i++)
		cout<<arr[i]<<endl;
}
