#include <iostream>

using namespace std;


int main()
{
	int testcase;
	int h;
	int w;
	int b;
	cin>>testcase;
	for(int i=0;i<testcase;i++)
	{
		cin>>h>>w>>b;
		for(int j=1;j<=w;j++)//w
		{
			for(int k=1;k<=h;k++)//h
			{
				b--;
				if(b==0)
					cout<<k*100+j<<endl;
			}
		}
	}
}
