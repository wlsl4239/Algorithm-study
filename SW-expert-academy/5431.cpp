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


int main()
{
	
	cin >> t;

	for (int test = 1;test <= t;test++)
	{
		int n, m;
		cin >> n >> m;
		bool arr[101];
		memset(arr, false, sizeof(arr));

		for (int i = 0;i < m;i++)
		{
			int a;
			cin >> a;
			arr[a] = true;
		}

		cout << "#" << test;
		for (int i = 1;i <= n;i++)
			if (!arr[i])
				cout <<" "<< i ;
		cout << endl;
	}
}

