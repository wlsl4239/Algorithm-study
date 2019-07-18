#include <cstdio>

int n;
int arr[51];
int main() {
	
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
		scanf("%d", &arr[i]);

	if (n == 1) printf("A");
	else if (n == 2 && arr[0] == arr[1]) printf("%d", arr[0]);
	else if (n == 2 && arr[0] != arr[1]) printf("A");
	else {
		int a = arr[0] == arr[1] ? 0 : ((arr[2] - arr[1]) / (arr[1] - arr[0]));
		int b = arr[1] - arr[0] * a;

		for (int i = 2; i < n; i++) {
			if ((arr[i - 1] != arr[i - 2] && a != (arr[i] - arr[i - 1]) / (arr[i - 1] - arr[i - 2])) || 
				(b != arr[i] - arr[i - 1] * a)) {
				printf("B");
				return 0;
			}
		}

		printf("%d", a * arr[n - 1] + b);
	}
}

