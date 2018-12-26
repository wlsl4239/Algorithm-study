#include <iostream>
#include <string>
#include <stack>


using namespace std;


int main()
{
	string s;
	while (1)
	{

		int A = 0, a = 0, num = 0, white = 0;
		getline(cin, s);

		if (s == "")
			break;
		for (int i = 0;i < s.size();i++)
		{
			if (s[i] == ' ')
				white++;
			else if (s[i] >= 'a' && s[i] <= 'z')
				a++;
			else if (s[i] >= 'A' && s[i] <= 'Z')
				A++;
			else
				num++;
		}

		cout << a << " " << A << " " << num << " " << white << "\n";
	}

}
