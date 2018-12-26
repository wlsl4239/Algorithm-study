#include<iostream>
#include<stack>
#include<string>
using namespace std;


bool isPair(const string& str)
{

	stack<char> s;
	for(int j=0;j<str.length();j++)
	{
		if(str[j]=='(')
			s.push(str[j]);
		else
		{
			if(s.empty())
				return false;

			if(str[j]==')' && s.top()=='(')
				s.pop();
		}
	}

	if(s.empty())
	{
		return true;
	}
	else
	{
		return false;
	}
}

int main()
{
	int t;
	string str;

	cin>>t;


	for(int i=0;i<t;i++)
	{

		cin>>str;
		if(isPair(str)==1)
			cout<<"YES"<<endl;
		else
			cout<<"NO"<<endl;
	}

}
