#include <iostream>
#define MAX_N 250000
#define MAX_T 65536
typedef long long ll;

using namespace std;

ll arr[MAX_N+1];
ll fw[MAX_T+1];
int n, k;
void update(int idx, ll val) {
	idx++;
	while (idx <= MAX_T) {
		fw[idx] += val;
		idx += (idx & -idx);
	}
}

ll sum(int idx) {
	idx++;
	ll ret = 0;
	while (idx > 0) {
		ret += fw[idx];
		idx -= (idx & -idx);
	}
	return ret;
}

ll getmidval() {
	int c = (k + 1) / 2;
	ll left = 0;
	ll right = MAX_T;

	ll mid;
	while (left < right) {
		mid = (left + right) / 2;
		if (sum(mid) < c)
			left = mid + 1;
		else
			right = mid;
	}
	return left;
}

int main() {
	cin >> n >> k;
	for (int i = 1; i <= n; i++) cin >> arr[i];
	for (int i = 1; i <= k; i++) update(arr[i], 1);

	ll midval = getmidval();

	for (int i = 1; i <= n - k; i++) {
		update(arr[i], -1);
		update(arr[i + k], 1);
		midval += getmidval();
	}
	cout << midval;

}
