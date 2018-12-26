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

ll update(ll pos,ll val,ll node,ll x,ll y)    //x,y : 구간
{
    if(y<pos || pos<x)
        return seg[node];
    if(x==y)
        return seg[node] = val;
    
    ll mid = (x+y)>>1;
    
    return seg[node] = (update(pos,val,node*2,x,mid) * update(pos,val,node*2+1,mid+1,y)) % 1000000007;
    
}

ll query(ll lo,ll hi,ll node,ll x,ll y)
{
    if(y<lo || hi<x)
        return 1;
    if(lo<=x && y<=hi)
        return seg[node];
    ll mid = (x+y)>>1;
    return (query(lo,hi,node*2,x,mid) * query(lo,hi,node*2+1,mid+1,y) )% 1000000007;
}
int main()
{
    cin>>n>>m>>k;
    
    for(ll i=1;i<=n;i++)
    {
        ll x;
        cin>>x;
        update(i,x,1,1,n);
    }
    
    for(ll i=0;i<m+k;i++)
    {
        ll x,y,z;
        cin>>x>>y>>z;
        
        if(x==1)
            update(y,z,1,1,n);
        else if(x==2)
            cout<<query(y,z,1,1,n)<<endl;
    }
}
