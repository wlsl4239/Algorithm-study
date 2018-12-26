#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int n;

int a;
int main()
{
	cin >> n;
	for (int i = 0;i < 9;i++)
	{
		cin >> a;
		n -= a;
	}
	cout << n << endl;
}
