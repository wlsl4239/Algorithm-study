//#447-A

#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

vector <int> arr;
int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif
	int n;
	int p;
	cin>>n>>p;

	arr.resize(n+1);

	int answer = -1;
	for(int i=1;i<=p;i++)
	{
		int a;
		cin>>a;
		
		if(arr[a%n] != 0)
		{
			answer = i;
			break;
		}
		arr[a%n] = 1;
	}

	cout<<answer<<endl;
}
