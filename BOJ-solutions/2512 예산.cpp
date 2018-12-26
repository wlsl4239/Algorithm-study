#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;

int n,m;
int money[10010];

bool func(long long int midd)
{
    int sum = 0;
    for(int i=0;i<n;i++)
    {
        if(money[i]>midd)
            sum += midd;
        else
            sum+= money[i];
    }
    
    
    return sum > m;
}


int main()
{
    cin>>n;
    int maxx = 0;
    int hap = 0;
    for(int i=0;i<n;i++)
    {
        cin>>money[i];
        hap += money[i];
        if(maxx<money[i])
            maxx = money[i];
    }
    cin>>m;
    
    long long int lo = 0;
    long long int hi = 100000001;
    
    if(hap <= m)
        cout<<maxx<<endl;
    else{
    while(lo<hi)
    {
        long long int mid = (lo+hi) / 2;
        
        if(func(mid))
            hi = mid;
        else
            lo = mid+1;
    }
    cout<<lo-1<<endl;

    }
}
