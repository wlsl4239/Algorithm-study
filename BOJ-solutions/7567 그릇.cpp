#include <iostream>
#include <string>
using namespace std;



int main()
{
	string st;

	cin >> st;

	int sum = 10;
	for (int i = 1;i < st.size();i++)
	{
		if (st[i] == st[i - 1])
			sum += 5;
		else
			sum += 10;
	}
	cout << sum << endl;
}
