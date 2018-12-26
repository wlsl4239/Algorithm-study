#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;

int n,m,k;
int seg[4000000];

int update(int pos,int val,int node,int x,int y)    //x,y : 구간
{
    if(y<pos || pos<x)
        return seg[node];
    if(x==y)
        return seg[node] = val;
    
    int mid = (x+y)>>1;
    
    return seg[node] = min(update(pos,val,node*2,x,mid), update(pos,val,node*2+1,mid+1,y));
    
}

int query(int lo,int hi,int node,int x,int y)
{
    if(y<lo || hi<x)
        return 1000000001;
    if(lo<=x && y<=hi)
        return seg[node];
    int mid = (x+y)>>1;
    return min(query(lo,hi,node*2,x,mid), query(lo,hi,node*2+1,mid+1,y));
}
int main()
{
    scanf("%d %d",&n,&m);
    
    
    for(int i=1;i<=n;i++)
    {
        int x;
        scanf("%d",&x);
        update(i,x,1,1,n);
    }
    
    for(int i=0;i<m;i++)
    {
        int x,y;
        scanf("%d %d",&x,&y);
        
        
        printf("%d\n",query(x,y,1,1,n));
    }
}
