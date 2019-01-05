#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int arr[101][3];
int str[101];
int dex[101];
int wis[101];
int n,k;
int ans = 1e9;
int cnt;

int main(){
    
    cin>>n>>k;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i][0]>>arr[i][1]>>arr[i][2];
        str[i] = arr[i][0];
        dex[i] = arr[i][1];
        wis[i] = arr[i][2];
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            for(int g=0;g<n;g++)
            {
                cnt = 0;
                
                for(int p=0;p<n;p++)
                {
                    if(str[i]>=arr[p][0] && dex[j]>=arr[p][1] && wis[g]>=arr[p][2])
                        cnt ++;
                    
                }
                
                if(cnt >= k)
                {
                    ans = min(ans,str[i]+dex[j]+wis[g]);
                }
            }
        }
    }
    
    cout<<ans<<endl;
    
}
