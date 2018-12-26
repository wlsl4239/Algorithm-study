#include <iostream>
#include <string>
#include <stack>


using namespace std;

int main()
{
	string s;
	string ans = "";
	cin >> s;
	ans += s[0];
	for (int i = 1;i < s.size(); i++)
		if (s[i] == '-')
			ans += s[i + 1];

	cout << ans << endl;

}
