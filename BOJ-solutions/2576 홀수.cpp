#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif

	int mmin = 1000;
	int sum=0;
	int arr[7];
	
	for(int i=0;i<7;i++)
	{
		cin>>arr[i];
		if(arr[i]%2 ==1)
		{
			sum += arr[i];
			if(mmin>arr[i])
				mmin = arr[i];
		}
	}

	if(sum==0)
		cout<<-1<<endl;
	else
		cout<<sum<<endl<<mmin<<endl;

}
