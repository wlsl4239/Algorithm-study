#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;

int n,m,k;
int seg[4000000];
int arr[4000000];

int update(int pos,int val,int node,int x,int y)    //x,y : 구간
{
    if(y<pos || pos<x)
        return seg[node];
    if(x==y)
        return seg[node] = val;
    
    int mid = (x+y)>>1;
    
    return seg[node] = update(pos,val,node*2,x,mid) + update(pos,val,node*2+1,mid+1,y);
    
}

int query(int val,int node,int x,int y)
{
    int mid = (x+y)>>1;
    
    if(x==y)
        return x;
    
    if(val<=seg[node*2])
        return query(val,node*2,x,mid);
    
    
    return query(val-seg[node*2],node*2+1,mid+1,y);
    
}
int main()
{
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++)
    {
        scanf("%d",&arr[i]);
        update(i,arr[i],1,1,n);
    }
    scanf("%d",&m);
    for(int i=0;i<m;i++)
    {
        int x,y,z;
        scanf("%d",&x);
        
        if(x==1)
        {
            scanf("%d %d",&y,&z);
            arr[y]+=z;
            update(y,arr[y],1,1,n);
        }
        
        else if(x==2)
        {
            scanf("%d",&y);
            cout<<query(y,1,1,n)<<endl;
            
        }
    }
}
