#include <cstdio>

int n;

long long ans = 5;
int main() {

	scanf("%d", &n);

	for (int i = 1; i < n; i++) {
		ans += 3 * i + 4;
		ans %= 45678;
	}
	printf("%lld", ans);
}
