#include <iostream>

using namespace std;

int n, r, c;
int arr[1010][1010];
int main() {
	cin >> n >> r >> c;
	bool a = false;
	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			cin >> arr[i][j];

	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			if ((i == r || j == c) && (arr[r][c] < arr[i][j]))
				a = true;

	if (a)
		cout << "ANGRY";
	else 
		cout << "HAPPY";

}
