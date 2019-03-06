#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
using namespace std;

bool visited[50001];
int n, m;
vector<vector<int>> vec;
queue<int> q;

void dfs(int now) {
	if (visited[now]) return;

	visited[now] = true;

	for (int i = 0; i < vec[now].size(); i++) {
		dfs(vec[now][i]);
	}
}
int main() {
	scanf("%d%d", &n, &m);
	vec.resize(n + 1);
	for (int i = 0; i < m; i++) {
		int a, b;
		scanf("%d%d", &a, &b);
		vec[a].push_back(b);
		vec[b].push_back(a);
	}

	int cnt = 0;

	for (int i = 1; i <= n; i++) {
		if (visited[i]) continue;
		cnt++;
		dfs(i);
	}
	printf("%d", cnt);
}