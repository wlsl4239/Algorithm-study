#include <iostream>

using namespace std;

int main()
{
	int count=0;
	

	cin>>count;
	for(int i=0;i<count;i++)
	{
		int sum=0;
		int number=0;
		cin>>number;
		for(int j=0;j<number;j++)
		{
			int x;
			cin>>x;
			sum+=x;
		}
		cout<<sum<<endl;
	}
}
