#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif

	int a;
	cin>>a;

	for(int i=1;i<=9;i++)
	{
		cout<<a<<" * "<<i<<" = "<<a*i<<endl;
	}
}
