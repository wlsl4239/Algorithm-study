#include <stdio.h>
#define MAX 10000000

int min(int a, int b) {
	return a > b ? b : a;
}

int main() {
	int n, m;
	scanf("%d", &n);
	scanf("%d", &m);
	int arr[101][101];
	for (int i = 0; i < 101; i++)
		for (int j = 0; j < 101; j++)
			arr[i][j] = MAX;

	for (int i = 0; i < m; i++) {
		int a, b, c;
		scanf("%d%d%d", &a, &b, &c);
		
		arr[a][b] = min(arr[a][b], c);
	}

	for (int k = 1; k <= n; k++) 
		for (int i = 1; i <= n; i++) 
			for (int j = 1; j <= n; j++) 
				arr[i][j] = min(arr[i][j], arr[i][k] + arr[k][j]);

	for (int i = 1; i <= n; i++) {
		arr[i][i] = 0;
		for (int j = 1; j <= n; j++) {
			if (arr[i][j] == MAX) arr[i][j] = 0;
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
		
	
}
