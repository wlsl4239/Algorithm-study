#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
#include <cstdio>

using namespace std;
int N;
int x,y,z;
int parent[101000];
int sol;
int find(int v){
    if(parent[v]==0)    return v;
    return parent[v] = find(parent[v]);
}

void merge(int u,int v,int w){
    u = find(u);
    v = find(v);
    if(u==v)
        return;
    parent[v] = u;
    N--;
    sol+= w;
}
int main(){
    cin>>N;
    vector<pair<int,pair<int,int>>> vt;
    vector<pair<int,int>> xt;
    vector<pair<int,int>> yt;
    vector<pair<int,int>> zt;
    for(int i=1;i<=N;i++){
        scanf("%d %d %d",&x,&y,&z);
        xt.push_back({x,i});
        yt.push_back({y,i});
        zt.push_back({z,i});
    }
    sort(xt.begin(),xt.end());
    sort(yt.begin(),yt.end());
    sort(zt.begin(),zt.end());
    for(int i=0;i<N-1;i++){
        vt.push_back({abs(xt[i].first-xt[i+1].first),{xt[i].second,xt[i+1].second}});
    }
    for(int i=0;i<N-1;i++){
        vt.push_back({abs(yt[i].first-yt[i+1].first),{yt[i].second,yt[i+1].second}});
    }
    for(int i=0;i<N-1;i++){
        vt.push_back({abs(zt[i].first-zt[i+1].first),{zt[i].second,zt[i+1].second}});
    }
    
    sort(vt.begin(),vt.end());
    for(int i=0;N>1;i++){
        merge(vt[i].second.first,vt[i].second.second,vt[i].first);
    }
    cout<<sol;
}
