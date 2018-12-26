#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
using namespace std;

vector< pair<pair<int, int>, pair<int, string> > > vec;
int n;

int main()
{
	cin >> n;

	for (int i = 0;i < n;i++)
	{
		string n;
		int k, e, m;
		cin >> n >> k >> e >> m;
		vec.push_back(make_pair(make_pair(-k, e), make_pair(-m, n)));

	}
	sort(vec.begin(), vec.end());


	for (int i = 0;i < n;i++)
		cout << vec[i].second.second + '\n';
}

