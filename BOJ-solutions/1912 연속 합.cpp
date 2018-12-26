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

int n;
int arr[100001];
int dp[100001];
int maxx;
int main()
{
    ios::sync_with_stdio(false);
    
    cin>>n;
    
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    dp[0] = arr[0];
    maxx = dp[0];
    for(int i=1;i<n;i++)
    {
        if(dp[i-1] + arr[i] >= arr[i])
            dp[i] = dp[i-1] + arr[i];
        else
            dp[i] = arr[i];
        maxx = max(maxx,dp[i]);
    }
    cout<<maxx<<endl;
    

}



