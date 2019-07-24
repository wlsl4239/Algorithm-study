#include <cstdio>

int n, m;
int arr[1100][1100];
int sarr[1100][1100];

int main() {
	scanf("%d%d", &n, &m);
	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			scanf("%d", &arr[i][j]);

	sarr[1][1] = arr[1][1];

	for (int i = 1; i <= n; i++) 
		for (int j = 1; j <= n; j++) 
			sarr[i][j] = arr[i][j] + sarr[i - 1][j] + sarr[i][j - 1] - sarr[i - 1][j - 1];


	for (int i = 0; i < m; i++) {
		int x1, x2, y1, y2;
		scanf("%d%d%d%d", &x1, &y1, &x2, &y2);
		
		
		printf("%d\n", sarr[x2][y2] - sarr[x2][y1-1] - sarr[x1-1][y2] + sarr[x1-1][y1-1]);
	}
}
