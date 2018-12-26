//#527-A

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	long long int a,b;
	cin>>a>>b;
	long long int ori = 0;
	while(a!=b && a>0 && b>0)
	{
		if(a>b)
		{
			ori += a/b;
			a = a%b;
		}
		else if(b>a)
		{
			ori += b/a;
			b = b%a;
		}
	}
	cout<<ori<<endl;
}
