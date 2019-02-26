//c++이지만 cin cout일경우 시간초과.
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<pair<int, int>> vec;
int n;
int main()
{
	cin >> n;

	while (n--)
	{
		int a, b;
		scanf("%d%d", &a, &b);
		vec.push_back(make_pair(a, b));
	}
	sort(vec.begin(), vec.end());
	for (int i = 0; i < vec.size(); i++)
		printf("%d %d\n", vec[i].first, vec[i].second);



}
