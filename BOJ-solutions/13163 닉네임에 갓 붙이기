#include <iostream>
#include <string>
#include <stack>


using namespace std;


int main()
{
	int t;
	string s;
	cin >> t;
	while (t--)
	{
		getchar();
		getline(cin, s);

		string sub = "god";
		int first = 0;
		
		for (int i = 0;i < s.size();i++)
			if (s[i] == ' ')
			{
				first = i;
				break;
			}

		for (int i = first + 1;i < s.size();i++)
			if (s[i] != ' ')
				sub += s[i];

		cout << sub << endl;
	}

}
