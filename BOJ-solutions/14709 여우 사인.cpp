#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
using namespace std;


bool isFox = false;
bool count13 = false;
bool count34 = false;
bool count14 = false;
bool ans[6];
int n;

int main()
{
	cin >> n;
	for (int i = 0;i < 6;i++)
		ans[i] = true;
	for (int i = 0;i < n;i++)
	{
		int a, b;
		cin >> a >> b;
		ans[a] = false;
		ans[b] = false;
		if (a == 1 && b == 3)
			count13 = true;
		if (a == 1 && b == 4)
			count14 = true;
		if (a == 3 && b == 4)
			count34 = true;
		if (a == 3 && b == 1)
			count13 = true;
		if (a == 4 && b == 1)
			count14 = true;
		if (a == 4 && b == 3)
			count34 = true;
	}
	
	if (!ans[1] && !ans[3] && !ans[4] && ans[2] && ans[5] && count13 && count14 && count34)
		cout << "Wa-pa-pa-pa-pa-pa-pow!" << endl;
	else
		cout << "Woof-meow-tweet-squeek" << endl;
}
