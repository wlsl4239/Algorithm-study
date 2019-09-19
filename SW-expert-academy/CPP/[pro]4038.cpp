#include <iostream>
#define X 257
#define MOD 0xFFFFFFFFFFFFFFFF

using namespace std;

int main() {
	int t;
	scanf("%d", &t);
	for (int test = 1; test <= t; test++) {
		char B[500010];
		char S[100010];
		int blen = 0;
		int slen = 0;
		int ans = 0;
		scanf("%s", B);
		scanf("%s", S);
		for (int i = 0; i < 500001; i++) {
			if (!B[i]) break;
			blen++;
		}
		for (int i = 0; i < 100001; i++) {
			if (!S[i]) break;
			slen++;
		}
		unsigned long long pow = 1;
		unsigned long long hashb = 0;
		unsigned long long hashs = 0;
		for (int i = 0; i < slen; i++) {
			hashb = (hashb * X + B[i]) % MOD;
			hashs = (hashs * X + S[i]) % MOD;
			pow = (pow*X) % MOD;
		}
		for (int i = 0; i <= blen - slen; i++) {
			if (hashb == hashs) ans++;
			hashb = ((hashb * X) % MOD - (B[i] * pow) % MOD) % MOD + B[i + slen];
		}
		printf("#%d %d\n", test, ans);
	}
}
