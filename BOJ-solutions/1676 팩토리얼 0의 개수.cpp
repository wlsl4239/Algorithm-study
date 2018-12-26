#include<stdio.h>
#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>

using namespace std;
int n,m,s,d;
int main()
{
	int n,s=0,m=1;
	cin>>n;
	while(m<=n) m*=5,s+=n/m;
	cout<<s<<endl;
}
