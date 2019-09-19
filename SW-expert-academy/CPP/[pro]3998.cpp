#include <iostream>
using namespace std;

int arr[100010];
int arr2[100010];
long long ans;
int n;

void merge(int left, int right) {
	int mid = (left + right) / 2;
	int l = left;
	int r = mid + 1;
	int k = left;

	while (l <= mid && r <= right) {
		if (arr[l] > arr[r]) {
			arr2[k++] = arr[r++];
			ans += mid - l+1;
		}
		else
			arr2[k++] = arr[l++];

	}

	if (l > mid) {		//좌측이 먼저 끝났을 때
		while (k <= right)
			arr2[k++] = arr[r++];
	}
	else {				//우측이 먼저 끝났을때
		while (k <= right)
			arr2[k++] = arr[l++];
	}
	for (int i = left; i <= right; i++)
		arr[i] = arr2[i];

}

void mergesort(int left, int right) {
	if (left < right) {
		int mid = (left + right) / 2;
		mergesort(left, mid);
		mergesort(mid + 1, right);
		merge(left, right);
	}
}
int main() {
	ios::sync_with_stdio(false);
	int t;
	cin >> t;
	for (int test = 1; test <= t; test++) {

		ans = 0;
		cin >> n;
		for (int i = 0; i < n; i++)
			cin >> arr[i];

		mergesort(0, n - 1);

		cout << "#" << test << " " << ans << "\n";

		for (int i = 0; i < n; i++) {
			arr[i] = 0;
			arr2[i] = 0;
		}
	}
}
