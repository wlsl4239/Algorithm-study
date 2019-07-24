#include <cstdio>

int n, m;
int arr[10010];

int main() {
	scanf("%d%d", &n, &m);
	for (int i = 0; i < n; i++) scanf("%d", &arr[i]);
	
	int s = 0;
	int e = 0;
	int sum = 0;
	int ans = 0;

	while (true) {
		if (sum >= m) sum -= arr[s++];
		else if (e == n) break;
		else sum += arr[e++];
		if (sum == m) ans++;
	}
	printf("%d", ans);

}
