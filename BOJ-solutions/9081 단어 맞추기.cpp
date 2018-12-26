#include<iostream>
#include<map>
#include<algorithm>
#include <string>
using namespace std;

int main()
{
	string str;
	string s;
	int t;
	cin>>t;
	while(t--)
	{
		cin>>str;
		s = str;
		next_permutation(str.begin(),str.end());
		if(s > str)
			str = s;
		cout<<str<<endl;
	}
}
