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


int main()
{
    ios::sync_with_stdio(false);

    cin>>n;
    
    int ans = 0;
    
    int num = n;
    while(1)
    {
        ans++;
        
        int a = num/10;
        int b = num%10;
        int c = (a+b)%10;
        num = b*10 + c;
        
        if(num==n)
            break;
        
        
    }
    
    cout<<ans;
        
    
}



