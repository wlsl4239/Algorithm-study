#include <iostream>
#include <queue>
#include <vector>
#define INF 1<<30
using namespace std;

int dist[1000];
vector<pair<int, int>> vec[1000];
int n, e, a, b;

int dijkstra(int start, int end) {
	priority_queue<pair<int, int>> pq;
	for (int i = 1; i <= n; i++) dist[i] = INF;
	pq.push({ 0,start });
	dist[start] = 0;

	while (!pq.empty()) {
		int now = pq.top().second;
		int cost = -pq.top().first;
		pq.pop();
		
		if (dist[now]<cost) continue;

		for (int i = 0; i < vec[now].size(); i++) {
			int next = vec[now][i].second;
			int nextcost = vec[now][i].first;
			
			if (dist[next] > cost + nextcost) {
				dist[next] = cost + nextcost;
				pq.push({ -(cost + nextcost), next });
			}
		}
	}

	return (dist[end] == INF) ? -1 : dist[end];
}

int main() {
	cin >> n >> e;
	for (int i = 0; i < e; i++) {
		int a, b, c;
		cin >> a >> b >> c;
		vec[a].push_back({ c,b });
		vec[b].push_back({ c,a });
	}
	cin >> a >> b;

	int dist1a = dijkstra(1, a);
	int distab = dijkstra(a, b);
	int distbn = dijkstra(b, n);
	bool flag1 = (dist1a != -1 && distab != -1 && distbn != -1);
	
	int dist1b = dijkstra(1, b);
	int distba = dijkstra(b, a);
	int distan = dijkstra(a, n);
	bool flag2 = (dist1b != -1 && distba != -1 && distan != -1);

	if (flag1&&flag2) cout << min(dist1a + distab + distbn, dist1b + distba + distan);
	else if (!flag1&&flag2) cout << dist1b + distba + distan;
	else if (flag1 && !flag2) cout << dist1a + distab + distbn;
	else cout << "-1";

}
