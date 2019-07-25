#include <iostream>
#define MAX_SIZE 1000010
using namespace std;


char T[2*MAX_SIZE];
char P[MAX_SIZE];
int fail[MAX_SIZE];
int n;
int ans;

int GCD(int a, int b) {
	return b ? GCD(b, a % b) : a;
}

void getFail() {
	int p = 0;
	for (int i = 1; i < n; i++) {
		while (p > 0 && P[i] != P[p])
			p = fail[p - 1];

		if (P[i] == P[p])
			fail[i] = ++p;
	}
}
void kmp() {
	int p = 0;
	for (int i = 0; i < 2*n-1; i++) {
		while (p > 0 && T[i] != P[p])
			p = fail[p - 1];

		if (T[i] == P[p]) {
			if (p == n - 1) {
				ans++;
				p = fail[p];
			}
			else
				p++;
		}
	}
}
int main() {
	ios::sync_with_stdio(false);
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> T[i];
		T[n + i] = T[i];
	}
	for (int i = 0; i < n; i++) 
		cin >> P[i];

	getFail();
	kmp();

	cout << ans/GCD(ans,n) << "/" << n / GCD(ans, n);
}
