#include <iostream>
#include <algorithm>
#include <queue>

using namespace std;

int arr[1001][1001];
bool visit[1001];
int n, m;

void prim(int num) {
	visit[num] = true;
	priority_queue<pair<int, int>> pq;	//다음 가중치/위치

	for (int i = 1; i <= n; i++) 
		if (arr[num][i] != 0) 
			pq.push({ arr[num][i],i });
		
	int ans = 0;
	while (!pq.empty()) {
		int now = pq.top().second;
		int nowcost = pq.top().first;
		pq.pop();

		if (visit[now]) continue;

		visit[now] = true;

		ans += nowcost;

		for (int i = 1; i <= n; i++)
			if (arr[now][i] != 0)
				pq.push({ arr[now][i],i });
	}
	cout << ans << endl;

}

int main() {
	ios::sync_with_stdio(false);

	cin >> n >> m;

	for (int i = 0; i < m; i++) {
		int a, b, c;
		cin >> a >> b >> c;
		arr[a][b] = max(arr[a][b], c);
		arr[b][a] = max(arr[a][b], c);
	}
	prim(1);
	
}
