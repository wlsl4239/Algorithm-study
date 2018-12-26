#include <iostream>
#include <cstdio>
#include <algorithm>
#include <queue>
#include <vector>
#include <stack>
#include <sstream>
#include <list>
#include <cmath>
using namespace std;

int m,n;
int arr[101];
int ans;
int minn = 1<<30;
int main()
{
    ios::sync_with_stdio(false);
    

    for(int i=1;i<=100;i++)
        arr[i] = i*i;
    
    cin>>m>>n;
    
    for(int i=0;i<101;i++)
        if(arr[i]>=m && arr[i] <=n){
            ans += arr[i];
            minn = min(minn,arr[i]);
        }
    if(ans == 0)
        cout<<-1;
    else
        cout<<ans<<"\n"<<minn;
}



