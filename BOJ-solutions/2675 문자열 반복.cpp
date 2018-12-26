#include <iostream>
#include <string>
#include <stack>


using namespace std;

int main()
{
	int t;
	cin >> t;
	while (t--) {
		int a;
		string s;

		cin >> a >> s;

		for (int i = 0;i < s.size();i++)
			for (int j = 0;j < a;j++)
				cout << s[i];
		cout << endl;
	}

}
