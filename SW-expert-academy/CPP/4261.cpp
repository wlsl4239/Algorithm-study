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
string num[1001];
 
int main()
{
    ios::sync_with_stdio(false);
     
    cin>>t;
     
    for(int test=1;test<=t;test++){
        string s;
        int n;
         
        cin>>s>>n;
        int ans = 0;
         
        for(int j=0;j<n;j++)
        {
            string str;
            cin>>str;
            for(int i=0;i<str.size();i++)
            {
                if(str[i] == 'a' || str[i] == 'b' || str[i] == 'c')
                    num[j] += '2';
                if(str[i] == 'd' || str[i] == 'e' || str[i] == 'f')
                    num[j] += '3';
                if(str[i] == 'g' || str[i] == 'h' || str[i] == 'i')
                    num[j] += '4';
                if(str[i] == 'j' || str[i] == 'k' || str[i] == 'l')
                    num[j] += '5';
                if(str[i] == 'm' || str[i] == 'n' || str[i] == 'o')
                    num[j] += '6';
                if(str[i] == 'p' || str[i] == 'q' || str[i] == 'r' || str[i]=='s')
                    num[j] += '7';
                if(str[i] == 'v' || str[i] == 't' || str[i] == 'u')
                    num[j] += '8';
                if(str[i] == 'w' || str[i] == 'x' || str[i] == 'y' || str[i] == 'z')
                    num[j] += '9';
                 
            }
        }
     
        for(int i=0;i<n;i++)
            if(s==num[i])
                ans++;
         
        cout<<"#"<<test<<" "<<ans<<"\n";
         
        for(int i=0;i<n;i++)
            num[i] = "";
    }
}
