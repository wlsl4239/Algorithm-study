#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
using namespace std;

bool arr[1010];

int main()
{
	for (int i = 1;i < 100;i++)
		arr[i] = true;
	for (int i = 111;i < 1001;i += 210)
	{
		for (int j = 0;j < 5;j++)
		{
			arr[i] = true;
			i += 12;
		}
		i -= 60;
	}
	for (int i = 210;i < 1001;i += 210)
	{
		for (int j = 0;j < 5;j++)
		{
			arr[i] = true;
			i += 12;
		}
		i -= 60;
	}
	int n;
	cin >> n;
	int ans = 0;
	for (int i = 1;i <= n;i++)
		if (arr[i])
			ans++;
	cout << ans << endl;

}
