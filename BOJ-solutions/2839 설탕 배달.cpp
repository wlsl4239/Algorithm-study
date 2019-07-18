#include <cstdio>
int arr[5001];

int min(int a, int b) {
	return a > b ? b : a;
}
int max(int a, int b) {
	return a > b ? a : b;
}

int main() {
	int n;
	scanf("%d", &n);

	for (int i = 0; i < 5001; i++)
		arr[i] = 1<<30;
	
	for (int i = 1; 5 * i <= n; i++) 
		arr[5 * i] = i;
	for (int i = 1; 3 * i <= n; i++)
		arr[3 * i] = min(arr[3*i],i);
	for (int i = 6; i <= n; i++) {
		arr[i] = min(arr[i], arr[i - 3] + 1);
		arr[i] = min(arr[i], arr[i - 5] + 1);
	}

	if (arr[n] != 1 << 30) printf("%d", arr[n]);
	else printf("-1");

}
