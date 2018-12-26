#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;

int n,m;
int lan[100010];

bool func(long long int midd)
{
    int sum = 0;
    for(int i=0;i<n;i++)
    {
        sum += lan[i]/midd;
    }
    
    
    return sum >= m;
}


int main()
{
    cin>>n>>m;
 
    for(int i=0;i<n;i++)
    {
        cin>>lan[i];
    }
    
    long long int lo = 0;
    long long int hi = 10000000001;
    
    while(lo<hi)
    {
        long long int mid = (lo+hi) / 2;
        
        if(func(mid))
            lo = mid+1;
        else
            hi = mid;
    }
    cout<<lo-1<<endl;
}
