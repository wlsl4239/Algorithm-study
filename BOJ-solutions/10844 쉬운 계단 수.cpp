#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;

#define MOD 1000000000;
int arr1[10];
int arr2[10];
int n;

int main()
{
    cin>>n;
    for(int i=1;i<10;i++)
        arr1[i] = 1;
    
    for(int i=0;i<n-1;i++)
    {
        arr2[1] = (arr2[1]+arr1[0]) %MOD;
        arr2[8] = (arr2[8]+arr1[9]) %MOD;
        for(int j=1;j<9;j++)
        {
            arr2[j-1] = (arr2[j-1] + arr1[j])%MOD;
            arr2[j+1] = (arr2[j+1] + arr1[j])%MOD;
            
        }
        
        for(int j=0;j<10;j++)
        {
            arr1[j] = arr2[j];
            arr2[j] = 0;
            
        }
        
    }
    
    int ans = 0;
    
    
    for(int j=0;j<10;j++)
    {
        ans += arr1[j];
        ans %= MOD;
    }
    cout<<ans<<endl;
}
