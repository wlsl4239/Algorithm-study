//#4123,숫자 만들기,DFS

#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#define INF 100000000;
using namespace std;

int t;
int n;
int op[4];
int arr[13];
int maxx;
int minn;

void dfs(int remain[4],int N,int now)
{
    if(n==N)
    {
        maxx = max(maxx,now);
        minn = min(minn,now);
        return;
    }
    
    for(int i=0;i<4;i++)
    {
        if(remain[i]>0)
        {
            remain[i]--;
            if(i==0)
                dfs(remain,N+1,now+arr[N]);
            else if(i==1)
                dfs(remain,N+1,now-arr[N]);
            else if(i==2)
                dfs(remain,N+1,now*arr[N]);
            else
                dfs(remain,N+1,now/arr[N]);

            remain[i]++;
        }
    }
}
int main()
{
    cin>>t;
    for(int tc = 1; tc <= t; tc++)
    {
        minn = INF;
        maxx = -INF;
        
        cin>>n;
        for(int i=0;i<4;i++)
            cin>>op[i];
        
        for(int i=0;i<n;i++)
            cin>>arr[i];
        
        
        dfs(op,1,arr[0]);
        
        cout<<"#"<<tc<<" "<<maxx-minn<<endl;
        
    }
    
}
