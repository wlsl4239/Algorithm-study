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
vector<pair<int,int>> vec;
int main()
{
    ios::sync_with_stdio(false);
   // cin>>t;
     
    for(int test = 1;test<=10;test++)
    {
        int ans = 0;
        int n;
        cin>>n;
         
        for(int i=0;i<100;i++)
        {
            int a;
            cin>>a;
            vec.push_back({a,i});
        }
        sort(vec.begin(),vec.end());
         
         
        for(int i=0;i<n;i++)
        {
            vec[99].first -= 1;
            vec[0].first += 1;
            sort(vec.begin(),vec.end());
             
            if(vec[0].first == vec[99].first)
                break;
            else if(vec[0].first == vec[99].first-1)
                break;
             
        }
        ans = vec[99].first - vec[0].first;
         
        cout<<"#"<<test<<" "<<ans<<"\n";
        vec.clear();
         
    }
     
}
