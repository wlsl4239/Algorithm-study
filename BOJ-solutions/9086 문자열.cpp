#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{

	int t;
	string str;
	cin>>t;
	while(t--)
	{
		cin>>str;
		cout<<str[0]<<str[str.size()-1]<<endl;
	}
}
