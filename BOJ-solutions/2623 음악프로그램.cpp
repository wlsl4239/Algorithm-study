#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <queue>
#include <cmath>

using namespace std;

int indegree[100010];
vector<vector<int>> assistant;

vector<vector<int>> vec;
priority_queue<int> pq;
vector<int> ans;
int main()
{
    int n,m;
    cin>>n>>m;
    
    int assi;
    
    int a;
    
    vec.resize(n+1);
    assistant.resize(m+1);
    for(int i=0;i<m;i++)
    {
        cin>>assi;
        for(int j=0;j<assi;j++)
        {
            cin>>a;
            assistant[i].push_back(a);
        }
        for(int k=0;k<assi-1;k++)
        {
        vec[assistant[i][k]].push_back(assistant[i][k+1]);
        indegree[assistant[i][k+1]]++;
        }
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
        ans.push_back(here);
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
    
    if(ans.size() != n)
        cout<<0<<endl;
    else
        for(int i=0;i<n;i++)
            cout<<ans[i]<<endl;
}
