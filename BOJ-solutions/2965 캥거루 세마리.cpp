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

int a,b,c;
int ans;

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>a>>b>>c;
    
    while(1)
    {
        if(a+1 == b && a+2 == c)
            break;
        
        if(b-a > c-b)
        {
            c = a+1;
            int temp = c;
            c = b;
            b = temp;
        }
        else
        {
            a = c-1;
            int temp = a;
            a = b;
            b = temp;
        }
        ans ++;
    }
        
    
    cout<<ans;
    
}



