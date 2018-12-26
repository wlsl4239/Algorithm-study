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
int ans;

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>n;
    
    while(n>0)
    {
        if(n%2 == 1)
            ans++;
        n/=2;
    }
    cout<<ans;
}



