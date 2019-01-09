#include <iostream>
#include <cstdio>
#include <algorithm>
#include <queue>
#include <vector>
#include <stack>
#include <sstream>
#include <list>
#include <cmath>
#include <tuple>
#include <cstring>
#include <string.h>
#include <limits>

using namespace std;

int t;
int a, b, c;

int main()
{
	
	cin >> t;

	for (int test = 1;test <= t;test++)
	{
		int ans = 0;

		cin >> a >> b >> c;
		int minn = min(a, b);
		int maxx = max(a, b);

		ans += c / minn;
		c -= ans*minn;
		ans += c / maxx;

		cout << "#" << test << " " << ans << endl;
	}
}

