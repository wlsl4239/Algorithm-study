#include <cstdio>

int main() {
	int t, v, e;
	scanf("%d", &t);
	while (t--) {
		scanf("%d%d", &v, &e);
		printf("%d\n", 2 - v + e);
	}
}
