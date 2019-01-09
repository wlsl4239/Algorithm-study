#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <cmath>
#include <string.h>
#include <string>
#include <stack>
#include <queue>

using namespace std;

string spotty[110];
string plain[110];
int n,m;
int ans = 0;

int main()
{
    cin>>n>>m;
    
    for(int i=0;i<n;i++)
        cin>>spotty[i];
    for(int i=0;i<n;i++)
        cin>>plain[i];
    
    int ans = 0;
    
    for(int i=0;i<m;i++)
    {
        int count = 0;
        for(int j=0;j<n;j++)
        {
            
            for(int k=0;k<n;k++)
            {
                if(plain[j][i] == spotty[k][i])
                    break;
                count++;
            }
            
        }
        if (count == n*n)
            ans++;
        
        count = 0;
    }
    
    cout<<ans<<endl;
}
