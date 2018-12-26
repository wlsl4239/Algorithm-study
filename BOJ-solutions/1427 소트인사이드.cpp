#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<int> vec;
int n;
int main()
{
	cin >> n;

	while (n > 0)
	{
		vec.push_back(n % 10);
		n /= 10;
	}
	sort(vec.begin(), vec.end());
	reverse(vec.begin(), vec.end());
	for (int i = 0;i < vec.size();i++)
		cout << vec[i];
	cout << '\n';


}
