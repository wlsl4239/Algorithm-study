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
        string s;
        cin>>s;
         
        int cnt = s[0]-'0';
        int ans = 0;
         
        for(int i=1;i<s.size();i++)
        {
            if(cnt<i)
            {
                ans += i - cnt;
                cnt += i - cnt;
            }
            cnt += s[i]-'0';
        }
         
         
         
         
        cout<<"#"<<test<<" "<<ans<<"\n";
    }
}
