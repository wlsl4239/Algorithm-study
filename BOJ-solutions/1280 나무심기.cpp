#include <iostream>
#define MAX_N 200010
#define MOD 1000000007
typedef long long ll;
using namespace std;

ll sum[MAX_N];
ll cnt[MAX_N];

void update(ll idx, ll val) {
	while (idx < MAX_N) {
		cnt[idx]++;
		sum[idx] += val;
		idx += (idx&-idx);
	}
}

ll getsum(int idx) {
	ll ret = 0;
	while (idx > 0) {
		ret += sum[idx];
		idx -= (idx&-idx);
	}
	return ret;
}
ll getcnt(int idx) {
	ll ret = 0;
	while (idx > 0) {
		ret += cnt[idx];
		idx -= (idx&-idx);
	}
	return ret;
}

int main() {
	ll n;
	ll ret = 1;
	ll tempcnt, tempsum;
	cin >> n;

	int x;
	cin >> x;
	x++;
	update(x, x);

	for (int i = 2; i <= n; i++) {
		cin >> x;
		x++;
		tempcnt = getcnt(x);
		tempsum = getsum(x);
		ll temp = ( ( tempcnt * x - tempsum ) + ( ( getsum(MAX_N - 1) - tempsum ) - ( x * (getcnt(MAX_N - 1) - tempcnt) ) ) ) % MOD;
		ret = (ret * temp) % MOD;
		update(x, x);
	}
	cout << ret;
	return 0;
}
