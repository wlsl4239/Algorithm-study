#include <iostream>
#include <string>
#include <stack>


using namespace std;

long long a, b, c, d;

int main()
{
	string s[4];
	
	for (int i = 0;i < 4;i++)
		cin >> s[i];

	for (int i = 0;i < s[0].size();i++)
	{
		a += s[0][i] - '0';
		a *= 10;
	}
	
	for (int i = 0;i < s[1].size();i++)
	{
		a *= 10;
		b += s[1][i] - '0';
		b *= 10;
	}
	for (int i = 0;i < s[2].size();i++)
	{
		c += s[2][i] - '0';
		c *= 10;
	}
	for (int i = 0;i < s[3].size();i++)
	{
		c *= 10;
		d += s[3][i] - '0';
		d *= 10;
	}

	a += b;
	c += d;

	cout << (a + c) / 10<< endl;

}
