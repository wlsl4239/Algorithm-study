#include <iostream>

#define MAX_N 1000010
typedef long long ll;

using namespace std;

ll fenwikTree[MAX_N];
ll arr[MAX_N] = { 0, };
ll getRightBit(ll n) {	//맨 오른쪽 1비트를 반환.
	return (n & -n);
}

void update(ll idx, ll val) {	
	while (idx <= MAX_N) {
		fenwikTree[idx] += val;
		idx += getRightBit(idx);
	}
}
ll sum(ll idx) {
	ll ret = 0;
	while (idx > 0) {
		ret += fenwikTree[idx];
		idx -= getRightBit(idx);
	}
	return ret;
}

int main() {
	ll n, m, k;	
	cin >> n >> m >> k;
	for (ll i = 1; i <= n; i++) {
		cin >> arr[i];
		update(i, arr[i]);
	}

	ll a, b, c;
	
	for (ll i = 1; i <= m + k; i++) {
		cin >> a >> b >> c;

		if (a == 1) {
			ll changedVal = c - arr[b];
			arr[b] = c;
			update(b, changedVal);
		}
		else cout << sum(c) - sum(b - 1)<<"\n";
	}

}
