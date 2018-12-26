#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif

	int max = 0;
	int x,y;
	int arr[9][9];

	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			cin>>arr[i][j];

			if(arr[i][j] > max)
			{
				max = arr[i][j];
				x = i+1;
				y = j+1;
			}
		}
	}

	cout<<max<<endl
		<<x<<" "<<y<<endl;


}
