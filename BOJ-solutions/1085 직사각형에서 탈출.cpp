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

int a,b,c,d;

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>a>>b>>c>>d;
    
    
    int ans = 1<<30;
    
    ans = min(ans,c-a);
    ans = min(ans,d-b);
    ans = min(ans,a);
    ans = min(ans,b);
    
    cout<<ans;
}



