#include <iostream>
using namespace std;

typedef long long ll;
#define MAX_N 1000100
#define MOD 1000000007

ll arr[MAX_N];
ll seg[MAX_N * 4];
int n, m, k, a, b, c;

ll mul(int now, int s, int e, int l, int r) {
	if (r < s || e < l) return 1;
	if (l <= s && e <= r) return seg[now];
	int mid = (s + e) / 2;
	return (mul(now * 2, s, mid, l, r) * mul(now * 2 + 1, mid + 1, e, l, r))%MOD;
}

ll update(int now, int s, int e, int idx, ll val) {
	if (idx < s || e < idx) return seg[now];
	if (s == e) return seg[now] = val;
	int mid = (s + e) / 2;
	return seg[now] = (update(now * 2, s, mid, idx, val) * update(now * 2 + 1, mid+1, e, idx, val))%MOD;
}

int main() {
	cin >> n >> m >> k;
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
		update(1, 0, n - 1, i, arr[i]);
	}

	for (int i = 0; i < m + k; i++) {
		cin >> a >> b >> c;
		b--;
		if (a == 1) 
			update(1, 0, n - 1, b, c);
		
		else 
			cout << mul(1, 0, n - 1, b, c - 1) << "\n";
	}
}
