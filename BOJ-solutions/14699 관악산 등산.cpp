#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>

using namespace std;

int height[5002];
vector<int> g[5002];
int visit[5002];
int func(int here, int rest)
{
    for (int i = 0; i < g[here].size(); i++)
    {
        int there = g[here][i];
        
        if (visit[there] >= 2)
        {
            visit[here] = max(visit[here], visit[there] + 1);
            continue;
        }
        
        int get = 1;
        get += func(there, i);
        
        if (visit[here] >= 2)
            visit[here] = max(visit[here], get);
        else
            visit[here] = get;
    }
    
    return visit[here];
}
int main()
{
    int n, m;
    scanf("%d %d", &n, &m);
    
    for (int i = 1; i <= n; i++)
    {
        scanf("%d", &height[i]);
        visit[i] = 1;
    }
    
    for (int i = 0; i < m; i++)
    {
        int a, b;
        scanf("%d %d", &a, &b);
    
        if (height[a] > height[b])
            g[b].push_back(a);
            
        else
            g[a].push_back(b);
    }
    

    for (int i = 1; i <= n; i++)
        func(i, 1);
    
    for (int i = 1; i <= n; i++)
        printf("%d\n", visit[i]);
    
    return 0;
}

