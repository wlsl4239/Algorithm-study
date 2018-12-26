#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;

int n,m,k;
int seg_min[4000000];
int seg_max[4000000];

int update_min(int pos,int val,int node,int x,int y)    //x,y : 구간
{
    if(y<pos || pos<x)
        return seg_min[node];
    if(x==y)
        return seg_min[node] = val;
    
    int mid = (x+y)>>1;
    
    return seg_min[node] = min(update_min(pos,val,node*2,x,mid), update_min(pos,val,node*2+1,mid+1,y));
    
}

int query_min(int lo,int hi,int node,int x,int y)
{
    if(y<lo || hi<x)
        return 1000000001;
    if(lo<=x && y<=hi)
        return seg_min[node];
    int mid = (x+y)>>1;
    return min(query_min(lo,hi,node*2,x,mid), query_min(lo,hi,node*2+1,mid+1,y));
}

int update_max(int pos,int val,int node,int x,int y)    //x,y : 구간
{
    if(y<pos || pos<x)
        return seg_max[node];
    if(x==y)
        return seg_max[node] = val;
    
    int mid = (x+y)>>1;
    
    return seg_max[node] = max(update_max(pos,val,node*2,x,mid), update_max(pos,val,node*2+1,mid+1,y));
    
}

int query_max(int lo,int hi,int node,int x,int y)
{
    if(y<lo || hi<x)
        return 0;
    if(lo<=x && y<=hi)
        return seg_max[node];
    int mid = (x+y)>>1;
    return max(query_max(lo,hi,node*2,x,mid), query_max(lo,hi,node*2+1,mid+1,y));
}
int main()
{
    cin>>n>>m;
    
    
    for(int i=1;i<=n;i++)
    {
        int x;
        scanf("%d",&x);
        update_min(i,x,1,1,n);
        update_max(i,x,1,1,n);
    }
    
    for(int i=0;i<m;i++)
    {
        int x,y;
        scanf("%d %d",&x,&y);
        
        printf("%d %d \n",query_min(x,y,1,1,n),query_max(x,y,1,1,n));
        
    }
}
