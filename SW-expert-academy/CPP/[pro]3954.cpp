#include <iostream>
using namespace std;

int n;
bool notPrime[1000010];
int phi[1000010];
long long sum[1000010];
int gcd(int a, int b) {
	if (!b) return a;
	return gcd(b, a%b);
}

int main() {
	notPrime[0] = true;
	notPrime[1] = true;
	for (int i = 2; i <= 1000; i++) {
		if (notPrime[i]) continue;
		for (int j = i + i; j <= 1000000; j += i)
			notPrime[j] = true;
	}

	phi[1] = 1;
	for (int i = 2; i <= 1000000; i++)
		if (!notPrime[i]) phi[i] = i - 1;

	for (int i = 2; i <= 1000; i++) {
		if (notPrime[i]) continue;
		int num = i;
		for (int j = 2; j <= 20; j++) {
			num *= i;
			if (num > 1000000) break;
			phi[num] = num - num / i;
		}
	}
	
	for (int i = 1; i <= 1000000; i++)
		for (int j = 1; i*j<=1000000; j++)
			if (gcd(i, j) == 1) 
				phi[i*j] = phi[i] * phi[j];
	sum[0] = phi[0];
	for (int i = 1; i <= 1000000; i++)
		sum[i] = sum[i - 1] + phi[i];

	int t;
	cin >> t;
	for (int test = 1; test <= t; test++) {
		int a, b;
		cin >> a >> b;
		long long ans = sum[b] - sum[a-1];
		
		cout << "#" << test << " " << ans << "\n";
	}
	

}
