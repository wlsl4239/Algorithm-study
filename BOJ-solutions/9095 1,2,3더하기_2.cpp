#include <iostream>
#include <stdio.h>
using namespace std;

int func(int i)
{
	if(i==1)
		return 1;
	if(i==2)
		return 2;
	if(i==3)
		return 4;
	return func(i-1)+func(i-2)+func(i-3);
}
int main()
{
	int t;
	int k;
	cin>>t;
	for(int i=0;i<t;i++)
	{
		cin>>k;
		int p = func(k);
		cout<<p<<endl;
	}
	return 0;
}
