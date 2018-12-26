#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <queue>
#include <cmath>

using namespace std;

int indegree[100010];

vector<vector<int>> vec;
priority_queue<int> pq;
vector<int> ans;
int main()
{
    int n,m;
    cin>>n>>m;
    
    int a,b;
    
    vec.resize(n+1);
    
    for(int i=0;i<m;i++)
    {
        cin>>a>>b;
        vec[a].push_back(b);
        indegree[b]++;
    }
    
    for(int i=1;i<=n;i++)
    {
        if(indegree[i] == 0)
            pq.push(-i);
    }
    
    while(pq.size())
    {
        int here = -pq.top();
        pq.pop();
        cout<<here<<" ";
        for(int i=0;i<vec[here].size();i++)
        {
            int there = vec[here][i];
            indegree[there]--;
            if(indegree[there]==0)
            {
                pq.push(-there);
            }
        }
    }
    cout<<endl;
}
