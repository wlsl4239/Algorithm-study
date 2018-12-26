#include <cstdio>
#include <algorithm>
#include <vector>
#define MAX_N 100000
#define INF 2100000000

using namespace std;

int n, k, par[MAX_N + 1][21], qmax[MAX_N + 1][21], qmin[MAX_N + 1][21], d[MAX_N + 1], visited[MAX_N + 1];

vector<vector<pair<int, int>>>vt;


void dfs(int here, int depth) {
    visited[here] = true;
    d[here] = depth;
    for (auto there : vt[here]) {
        if (visited[there.first])
            continue;
        dfs(there.first, depth + 1);
        par[there.first][0] = here;
        qmin[there.first][0] = there.second;
        qmax[there.first][0] = there.second;
    }
}


void f() {
    for (int j = 1; j < 21; j++) {
        for (int i = 1; i <= n; i++) {
            par[i][j] = par[par[i][j - 1]][j - 1];
            qmin[i][j] = min(qmin[i][j - 1], qmin[par[i][j - 1]][j - 1]);
            qmax[i][j] = max(qmax[i][j - 1], qmax[par[i][j - 1]][j - 1]);
        }
    }
}

pair<int, int> lca(int x, int y) {      //y가 더 깊게 맞춤.
    int rmin = INF;
    int rmax = -INF;
    if (d[x] > d[y])
        swap(x, y);
    for (int i = 20; i >= 0; i--) {
        if (d[y] - d[x] >= (1 << i)) {
            rmin = min(rmin, qmin[y][i]);
            rmax = max(rmax, qmax[y][i]);
            y = par[y][i];
        }
    }                       //높이 맞춰주기
    
    if (x == y)
        return{ rmin,rmax };        //x가 lca일경우.
    
    for (int i = 20; i >= 0; i--) {
        if (par[x][i] != par[y][i]) {
            rmin = min(rmin, min(qmin[x][i], qmin[y][i]));
            rmax = max(rmax, max(qmax[x][i], qmax[y][i]));
            x = par[x][i];
            y = par[y][i];
        }
    }
    rmin = min(rmin, min(qmin[x][0], qmin[y][0]));
    rmax = max(rmax, max(qmax[x][0], qmax[y][0]));
    return{ rmin,rmax };
}



int main() {
    scanf("%d", &n);
    vt.resize(n + 1);
    for (int i = 0; i < n - 1; i++) {
        int a, b, c;
        scanf("%d%d%d", &a, &b, &c);
        vt[a].emplace_back(b, c);
        vt[b].emplace_back(a, c);
    }
    dfs(1, 0);
    f();
    scanf("%d", &k);
    while (k--) {
        int a, b;
        scanf("%d%d", &a, &b);
        pair<int, int> r = lca(a, b);
        printf("%d %d\n", r.first, r.second);
    }
    return 0;
}
