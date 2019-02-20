#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

char arr[55][55];
int dx[4] = { 1,0,-1,0};
int dy[4] = { 0,1,0,-1 };
int n;
int ans;

void func() {
	int cnt;
	for (int i = 0; i < n; i++) {
		cnt = 1;
		for (int j = 0; j < n-1; j++) {
			if (arr[i][j] == arr[i][j + 1])
				cnt++;
			else
				cnt = 1;
			ans = max(cnt, ans);
		}
	}
	for (int i = 0; i < n; i++) {
		cnt = 1;
		for (int j = 0; j < n-1; j++) {
			if (arr[j][i] == arr[j+1][i])
				cnt++;
			else
				cnt = 1;
			ans = max(cnt, ans);
		}
	}
}

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
			string s;
			cin >> s;
			for (int k = 0; k < s.size(); k++)
				arr[i][k] = s[k];
		}

	func();
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < 4; k++) {
				if (0<= i + dy[k] && i + dy[k]<n &&
					0<= j + dx[k] && j + dx[k]<n &&
					(arr[i][j] != arr[i + dy[k]][j + dx[k]])) {
					char t = arr[i][j];
					arr[i][j] = arr[i + dy[k]][j + dx[k]];
					arr[i + dy[k]][j + dx[k]] = t;


					func();
					arr[i + dy[k]][j + dx[k]] = arr[i][j];
					arr[i][j] = t;
					
				}
			}
		}
	}
		
	cout << ans << endl;

}

