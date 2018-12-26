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
 
 
int t;
int num[101];
 
int main()
{
    ios::sync_with_stdio(false);
    cin>>t;
    for(int tt=1;tt<=t;tt++){
        int test;
        cin>>test;
         
        int ans = 0;
        int n = 0;
        int a;
        for(int i=0;i<1000;i++){
            cin>>a;
            num[a]++;
        }
         
        for(int i=0;i<100;i++)
            if(num[i] >= n){
                n = num[i];
                ans = i;
            }
                 
         
        cout<<"#"<<test<<" "<<ans<<"\n";
         
        for(int i=0;i<101;i++)
            num[i] = 0;
    }
}
