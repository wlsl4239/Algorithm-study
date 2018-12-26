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

int n;
int arr[13][13];	// 0:empty 1:core 2:line
int t;
vector<pair<int,int>> v;
int pnum, res;


bool isDraw(int x, int y, int dir)
{
	if (dir == 0) {
		for (int i = y + 1;i < n;i++)
			if (arr[x][i] != 0)
				return false;
	}
	else if (dir == 1) {
		for (int i = x + 1;i < n;i++)
			if (arr[i][y] != 0)
				return false;
	}
	else if (dir == 2) {
		for (int i = 0;i < y;i++)
			if (arr[x][i] != 0)
				return false;
	}
	else if (dir == 3) {
		for (int i = 0;i < x;i++)
			if (arr[i][y] != 0)
				return false;
	}
	return true;
}

int drawLine(int x, int y, int dir, int flag) {
	int ans = 0;
	if (dir == 0) {
		for (int i = y + 1; i < n; i++) {
			arr[x][i] = (flag == 0) ? 2 : 0;
			ans++;
		}
	}
	else if (dir == 1) {
		for (int i = x + 1; i < n; i++) {
			arr[i][y] = (flag == 0) ? 2 : 0;
			ans++;
		}
	}
	else if (dir == 2) {
		for (int i = 0; i < y; i++) {
			arr[x][i] = (flag == 0) ? 2 : 0;
			ans++;
		}
	}
	else {
		for (int i = 0; i < x; i++) {
			arr[i][y] = (flag == 0) ? 2 : 0;
			ans++;
		}
	}
	return ans;
}

void dfs(int idx, int num, int line) {
	if (idx == v.size()) {
		if (pnum < num) {
			res = line;
			pnum = num;
		}
		else if (pnum == num) {
			if (res > line) res = line;
		}
	}
	else {
		for (int i = 0; i < 4; i++) {
			if (isDraw(v[idx].first, v[idx].second, i)) {
				dfs(idx + 1, num + 1, line + drawLine(v[idx].first, v[idx].second, i, 0));
				drawLine(v[idx].first, v[idx].second, i, 1);
			}
		}
		dfs(idx + 1, num, line);
	}
}

int main()
{
	
	cin >> t;

	for (int test = 1;test <= t;test++)
	{
		cin >> n;

		for (int i = 0;i < n;i++)
			for (int j = 0;j < n;j++) {
				cin >> arr[i][j];
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) continue;
				if (arr[i][j] == 1) {
					v.push_back({ i, j });
				}
			}

		res = numeric_limits<int>::max();
		pnum = 0;
		dfs(0, 0, 0);
		cout << "#" << test << " " << res << "\n";

		v.clear();

		for (int i = 0;i < n;i++)
			for (int j = 0;j < n;j++)
				arr[i][j] = 0;
	}
}
