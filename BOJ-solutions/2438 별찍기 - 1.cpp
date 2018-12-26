#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int a;
	cin>>a;
	for(int i=a-1;i>=0;i--)
	{
		for(int j=a;j>i;j--)
			cout<<"*";
		cout<<endl;
	}

}
