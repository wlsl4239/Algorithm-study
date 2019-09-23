#\
pragma GCC optimize("O2")
#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
using namespace std;
vector<vector<pair<int, int>>> map;
vector<vector<pair<int, int>>> rmap;
priority_queue<pair<int, int>> pq;
int dist[50001];
int rdist[50001];
int t;
int n, m, x;

void dijkstra(int start) {
	pq.push({ 0, start });
	dist[start] = 0;
	while (!pq.empty()) {
		int cost = -pq.top().first;
		int now = pq.top().second;
		pq.pop();
		if (dist[now] < cost) continue;
		for (int i = 0; i < map[now].size(); i++) {
			int next = map[now][i].second;
			int nextcost = map[now][i].first;
			if (cost + nextcost < dist[next]) {
				dist[next] = cost + nextcost;
				pq.push({ -(cost + nextcost),next });
			}
		}
	}
}
 
void rdijkstra(int start) {
	pq.push({ 0, start });
	rdist[start] = 0;
	while (!pq.empty()) {
		int cost = -pq.top().first;
		int now = pq.top().second;
		pq.pop();
		if (rdist[now] < cost) continue;
		for (int i = 0; i < rmap[now].size(); i++) {
			int next = rmap[now][i].second;
			int nextcost = rmap[now][i].first;
			if (cost + nextcost < rdist[next]) {
				rdist[next] = cost + nextcost;
				pq.push({ -(cost + nextcost),next });
			}
		}
	}
}
int main() {
	ios::sync_with_stdio(false);
	cin >> t;
	for (int test = 1; test <= t; test++) {
		int ans = 0;
		cin >> n >> m >> x;
		map.resize(n + 1);
		rmap.resize(n + 1);
		for (int i = 0; i < m; i++) {
			int a, b, c;
			cin >> a >> b >> c;
			map[a].push_back({ c,b });
			rmap[b].push_back({ c,a });
		}
		for (int i = 1; i <= n; i++) {
			dist[i] = 1 << 30;
			rdist[i] = 1 << 30;
		}
		dijkstra(x);
		rdijkstra(x);
		for (int i = 1; i <= n; i++) ans = (ans < dist[i] + rdist[i]) ? dist[i] + rdist[i] : ans;
		cout << "#" << test << " " << ans << "\n";
		map.clear();
		rmap.clear();
	}
}
