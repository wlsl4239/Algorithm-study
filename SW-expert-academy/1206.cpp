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
 
bool arr[1010][256];
 
int main()
{
    ios::sync_with_stdio(false);
   // cin>>t;
     
    for(int test = 1;test<=10;test++)
    {
        int ans = 0;
        int n;
        cin>>n;
        for(int i=0;i<n;i++)
        {
            int a;
            cin>>a;
            for(int j=0;j<a;j++)
                arr[i][j] = true;
        }
         
        for(int i=2;i<n-2;i++)
            for(int j=0;j<256;j++)
                if(arr[i][j])
                    if(!arr[i-2][j] && !arr[i-1][j] && !arr[i+1][j] && !arr[i+2][j])
                        ans++;
         
         
        cout<<"#"<<test<<" "<<ans<<"\n";
         
         
        for(int i=2;i<n-2;i++)
            for(int j=0;j<256;j++)
                arr[i][j] = false;
    }
     
}
