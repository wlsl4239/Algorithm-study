#include <cstdio>

char B[500001];
char S[100001];
int fail[100001];
int blen, slen;
int ans;

void init() {
	for (int i = 0; i < 500001; i++) B[i] = ' ';
	for (int i = 0; i < 100001; i++) S[i] = ' ';
	for (int i = 0; i < 100001; i++) fail[i] = 0;
	ans = 0;
	blen = 0;
	slen = 0;
}

void getFail() {
	int p = 0;
	for (int i = 1; i < slen; i++) {
		while (p > 0 && S[i] != S[p])
			p = fail[p - 1];

		if (S[i] == S[p])
			fail[i] = ++p;
	}
}

void kmp() {
	int p = 0;
	for (int i = 0; i < blen; i++) {
		while (p > 0 && B[i] != S[p]) 
			p = fail[p - 1];

		if (B[i] == S[p]) {
			if (p == slen - 1) {
				ans++;
				p = fail[p];
			}
			else {
				p++;
			}
		}

	}
}

int main() {
	int t; 
	scanf("%d", &t);

	for (int test = 1; test <= t; test++) {
		init();
		scanf("%s", B);
		scanf("%s", S);

		for (int i = 1; i < 500001; i++) {
			if (B[i] == ' ') break;
			blen++;
		}
		for (int i = 1; i < 100001; i++) {
			if (S[i] == ' ') break;
			slen++;
		}
		getFail();
		
		kmp();

		printf("#%d %d\n", test, ans);
	}

}
