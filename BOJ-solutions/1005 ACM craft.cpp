#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;

vector<vector<int>> vec;
priority_queue<int> pq;
int indegree[100010];
int build_time[1001];
int res[1001];


int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        memset(indegree,0,sizeof(indegree));
        memset(build_time,0,sizeof(build_time));
        memset(res,0,sizeof(res));
        int n,k;
        
        cin>>n>>k;
        
        vec.resize(n+1);
        
        for(int i=1;i<=n;i++)
            cin>>build_time[i];
        
        for(int i=1;i<=k;i++)
        {
            int a,b;
            cin>>a>>b;
            vec[a].push_back(b);
            indegree[b]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(indegree[i] == 0)
            {
                pq.push(-i);
                res[i] = build_time[i];
            }
        }
    
        
        while(pq.size())
        {
            int here = -pq.top();
            pq.pop();
            
            for(int i=0;i<vec[here].size();i++)
            {
                int there = vec[here][i];
                indegree[there]--;
                res[there] = max(res[there],res[here]+build_time[there]);
                if(indegree[there]==0)
                {
                    pq.push(-there);
                }
            }
        }
        int ans;
        cin>>ans;
        cout<<res[ans]<<endl;
        
        vec.clear();
        
    }
}
