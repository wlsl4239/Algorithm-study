#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
using namespace std;

vector<pair<long long , long long>> arr;
int n;
long double ans;
int main()
{
	cin >> n;
	for (int i = 0;i < n;i++)
	{
		int x, y;
		cin >> x >> y;
		arr.push_back({ x,y });
	}

	ans += arr[n - 1].first * arr[0].second - arr[0].first * arr[n-1].second;

	for (int i = 0;i < n - 1;i++)
	{
		ans += arr[i].first * arr[i+1].second - arr[i+1].first * arr[i].second;
	}
	ans = abs(ans);
	ans /= 2;
	cout.precision(1);
	cout << fixed << ans << endl;
}
