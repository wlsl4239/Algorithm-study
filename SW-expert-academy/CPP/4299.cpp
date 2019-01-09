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
 
int t;
 
int main()
{
    ios::sync_with_stdio(false);
     
    cin>>t;
     
    for(int test=1;test<=t;test++){
         
         
        int ans = 0;
        int num = 11*1440 + 11*60 + 11;
        int d,h,m;
        cin>>d>>h>>m;
         
        if((d*1440 + h*60 + m) < num)
            ans = -1;
        else
            ans =(d*1440 + h*60 + m) - num;
         
         
        cout<<"#"<<test<<" "<<ans<<"\n";
         
    }
}
