#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int a;
	cin>>a;
	for(int i=0;i<a;i++)
	{
		for(int j=i;j<a;j++)
			cout<<"*";

		cout<<endl;
	}

}
