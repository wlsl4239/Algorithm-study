#include <iostream>
#include <string>
using namespace std;
                                            
int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif
	int a[5];
	int sum=0;
	for(int i=0;i<5;i++)
	{
		cin>>a[i];
		a[i]*=a[i];
		sum+= a[i];
	}
	sum%=10;
	cout<<sum<<endl;

}
