#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <cmath>
#include <string.h>
#include <string>
#include <stack>
#include <queue>

using namespace std;

int x,y;
int ans = 0;
int main()
{
    cin>>x>>y;
    
    int n = 0;
    
    int startxy;
    if(x>y)
        startxy = -1;
    else if(y>x)
        startxy = 1;
    else
        startxy = 0;
    
    int nowx = x;
    int nowxy;
    while(startxy!=0)
    {
        ans += abs((x + pow(-2,n)) - nowx);
        
        nowx = x + pow(-2,n);
        
        if(nowx>y)
            nowxy = -1;
        else
            nowxy = 1;
        
        if(startxy != nowxy)
        {
            ans -= abs(y - nowx);
            break;
        }
        n++;
    }
    
    cout<<ans<<endl;
}
