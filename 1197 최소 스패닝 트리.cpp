#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>

using namespace std;

int v,e;
int a,b,c;

int par[10010];

priority_queue< pair< int, pair<int,int> > > pq;

int cnt = 0;
int ans = 0;

int find(int v){
    if(v==par[v])
        return v;
    return par[v] = find(par[v]);
}

void merge(int u, int v){
    u = find(u);
    v = find(v);
    if(u==v)
        return;
    par[u] = v;
}

int main()
{
    cin>>v>>e;
    
    for(int i=1;i<=v;i++)
        par[i] = i;
    
    for(int i=0;i<e;i++)
    {
        cin>>a>>b>>c;
        pq.push(make_pair(-c,make_pair(a,b)));
    }
    
    while(pq.size()){
        
        int cv = -pq.top().first;
        int av = pq.top().second.first;
        int bv = pq.top().second.second;
        
        pq.pop();
        
        if(find(av) != find(bv)){
            merge(av,bv);
            ans += cv;
            cnt++;
            if(cnt == v-1)
                break;
        }
        
    }

    cout<<ans<<endl;

}
