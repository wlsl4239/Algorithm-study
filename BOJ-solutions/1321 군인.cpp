#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;
typedef long long int ll;
ll n,m,k;
ll seg[4000000];
ll arr[4000000];
ll update(ll pos,ll val,ll node,ll x,ll y)    //x,y : 구간
{
    if(y<pos || pos<x)
        return seg[node];
    if(x==y)
        return seg[node] = val;
    
    ll mid = (x+y)>>1;
    
    return seg[node] = update(pos,val,node*2,x,mid) + update(pos,val,node*2+1,mid+1,y);
    
}

ll query(ll val,ll node,ll x,ll y)
{
    ll mid = (x+y)>>1;
    
    if(x==y)
        return x;
    
    if(val<=seg[node*2])
        return query(val,node*2,x,mid);
    
    
    return query(val-seg[node*2],node*2+1,mid+1,y);
    
}
int main()
{
    cin>>n;
    
    for(ll i=1;i<=n;i++)
    {
        cin>>arr[i];
        update(i,arr[i],1,1,n);
    }
    cin>>m;
    for(ll i=0;i<m;i++)
    {
        ll x,y,z;
        cin>>x;
        
        if(x==1)
        {
            cin>>y>>z;
            arr[y]+=z;
            update(y,arr[y],1,1,n);
        }
        
        else if(x==2)
        {
            cin>>y;
            cout<<query(y,1,1,n)<<endl;
            
        }
    }
}
