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
#include <time.h>
#include <map>
#include <deque>
using namespace std;
#define MAX 1010101

long long day[MAX];
int n;
int t;
int main() {
	cin >> t;
	while (t--) {
		cin >> n;
		for (int i = 0; i < n; i++) {
			cin >> day[i];
		}

		long long maxDay = 0;
		long long income = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (maxDay < day[i]) {
				maxDay = day[i];
			}
			if (maxDay > day[i]) {
				income += (maxDay - day[i]);
			}

		}
		cout << income << endl;

		memset(day, 0, sizeof(day));
	}
	return 0;
}
