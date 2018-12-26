//851-A

#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
#include <cmath>
using namespace std;

int main() {

	int n, k, t;
	cin >> n >> k >> t;
	cout << min(t, min(k, n + k - t));
	return 0;
}
