#include <iostream>
#include <queue>
#include <vector>
#define INF 1<<30
using namespace std;

int dist[20020];
vector<pair<int, int>> vec[20020];
int cnt;

void dijkstra(int start) {
	priority_queue<pair<int, int>> pq;
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
}

int main() {
	int v, e, k;
	cin >> v >> e >> k;

	for (int i = 0; i < e; i++) {
		int a, b, c;
		cin >> a >> b >> c;
		vec[a].push_back({ c,b });
	}

	for (int i = 1; i <= v; i++) dist[i] = INF;
	dijkstra(k);

	for (int i = 1; i <= v; i++) {
		if (dist[i] == INF)
			cout << "INF\n";
		else
			cout << dist[i] << "\n";
	}

}
