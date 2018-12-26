#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;
int n, m, l;
vector < vector<int> > tree;
vector<int> tin, tout;
int timer;
vector < vector<int> > parent;

void dfs (int v, int p = 0) {
    tin[v] = ++timer;
    parent[v][0] = p;
    for (int i=1; i<=l; ++i)
        if(parent[v][i-1])
            parent[v][i] = parent[parent[v][i-1]][i-1];
    for (size_t i=0; i<tree[v].size(); ++i) {
        int to = tree[v][i];
        if (to != p)
            dfs (to, v);
    }
    tout[v] = ++timer;
}

bool upper(int a, int b) {
    return tin[a] <= tin[b] && tout[a] >= tout[b];
}

int lca(int a, int b) {
    if (upper(a, b))  return a;
    if (upper(b, a))  return b;
    for (int i=l; i>=0; --i)
        if (parent[a][i] && !upper(parent[a][i], b))
            a = parent[a][i];
    return parent[a][0];
}

int main() {
    cin>>n;
    tin.resize (n+1),  tout.resize (n+1),  parent.resize (n+1);
    tree.resize(n+1);
    for(int i=0;i<n-1;i++)
    {
        int a,b;
        cin>>a>>b;
        tree[a].push_back(b);
        tree[b].push_back(a);
    }
    
    l = 1;
    while ((1<<l) <= n)  ++l;
    for (int i=0; i<= n; ++i)  parent[i].resize (l+1);
    dfs (1);
    
    cin>>m;
    
    for (int i=0;i<m;i++) {
        int a, b; // текущий запрос
        cin>>a>>b;
        cout<<lca(a,b)<<endl; // ответ на запрос
    }
    
}
