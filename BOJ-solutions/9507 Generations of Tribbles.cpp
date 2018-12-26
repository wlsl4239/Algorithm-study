#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;


unsigned long long koong[100];
int main()
{
	koong[0] = 1;
	koong[1] = 1;
	koong[2] = 2;
	koong[3] = 4;

	for (int i = 4;i < 68;i++)
		koong[i] = koong[i - 1] + koong[i - 2] + koong[i - 3] + koong[i - 4];

	int t;
	cin >> t;
	while (t--)
	{
		int a;
		cin >> a;
		cout << koong[a] << endl;
	}
}
