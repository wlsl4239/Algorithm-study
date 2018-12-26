#include <iostream>
#include <string>
#include <stack>


using namespace std;


int main()
{
	string s;

	while (1)
	{
		getline(cin, s);
		
		if (s == "END")
			break;

		for (int i = s.size() - 1;i >= 0;i--)
			cout << s[i];
		cout << endl;
	}
}
