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
int arr[11];
int ans = 0;
int main()
{
    ios::sync_with_stdio(false);
    
    cin>>n;
    if(n==0)
        ans = 1;
    else{
    while(n>0)
    {
        arr[n%10]++;
        n/=10;
    }
    
    int a = arr[6] + arr[9];
    
    if(a%2==1)
        a++;
    arr[6] = a/2;
    arr[9] = a/2;
    
    for(int i=0;i<10;i++)
        ans = max(ans,arr[i]);
    }
    cout<<ans;
}



