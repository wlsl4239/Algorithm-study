#include <iostream>
#include <string>
#include <algorithm>
using namespace std;


int alpha[26];


string conv(string& s)
{
	for(int i=0;i<s.length();i++)
	{
		if(s[i]>='a'){
			s[i]=s[i]-'a'+'A';}
	}
	return s;
}

int main()
{
    string a;
	char k = 'A';
	int	largest=0;
	string largestalpha;
    cin>>a;
	
	conv(a);
	

	for(int i=0;i<a.length();i++)
	{
		alpha[a[i]-'A']++;
	}
	
	
	for(int j=0;j<26;j++)
	{
		if(largest<alpha[j])
		{
			largest = alpha[j];
			largestalpha = 'A'+j;
		}
	}

	sort(alpha,alpha+26);
	reverse(alpha,alpha+26);
	if(alpha[0]==alpha[1])
		largestalpha = '?';

	cout<<largestalpha<<endl;
	return 0;
}
