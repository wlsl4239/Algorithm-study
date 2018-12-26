#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int a;
	cin>>a;
	int g = a-1;
	int h = 1;
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<g;j++)
			cout<<" ";
		for(int k=0;k<h;k++)
			cout<<"*";

		g--;
		h++;
		cout<<endl;
	}

}
