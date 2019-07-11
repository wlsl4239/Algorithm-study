#include <iostream>

using namespace std;

int main()
{
	int t;
	scanf("%d", &t);
	while (t--) {
		int a, b;
		scanf("%d%d", &a, &b);
		int ans = a % 10;
		for (int i = 1; i < b; i++) {
			ans *= a;
			ans %= 10;
		}
		if (ans % 10 == 0) ans = 10;
		printf("%d\n", ans);
	}
}
