#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;

int n,m;
int lesson[100010];

bool func(long long int midd)
{
    int bdnum = 1;
    long long int sum = 0;
    for(int i=0;i<n;i++)
    {
        if(sum+lesson[i] > midd)
        {
            sum = lesson[i];
            bdnum ++;
        }
        else
            sum += lesson[i];
    }
    
    
    return bdnum <= m;
}


int main()
{
    cin>>n>>m;
 
    int maxtrack = 0;
    for(int i=0;i<n;i++)
    {
        cin>>lesson[i];
        if(maxtrack<lesson[i])
            maxtrack = lesson[i];
    }
    
    long long int lo = 0;
    long long int hi = 1000000001;
    
    while(lo<hi)
    {
        long long int mid = (lo+hi) / 2;
        
        if(func(mid) && mid>=maxtrack)
            hi = mid;
        else
            lo = mid + 1;
    }
    cout<<lo<<endl;
}
