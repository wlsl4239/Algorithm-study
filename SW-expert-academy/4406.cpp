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
 
 
int main()
{
    ios::sync_with_stdio(false);
     
    cin>>t;
     
    for(int test = 1;test<=t;test++)
    {
        string st;
        string ans = "";
         
        cin>>st;
         
        for(int i=0;i<st.size();i++)
            if(st[i] != 'a' && st[i] != 'e' && st[i] != 'i' && st[i] != 'o' && st[i] != 'u')
                ans+= st[i];
         
        cout<<"#"<<test<<" "<<ans<<"\n";
         
         
    }
     
}
