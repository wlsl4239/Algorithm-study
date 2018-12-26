#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>

using namespace std;

#define NUM 1000010

bool era[NUM];
int ans;
int n,k;

int main(){
    cin>>n>>k;
    
    era[0] = true;
    era[1] = true;
    for(int i=2;i<=n;i++)
        if(!era[i])
            for(int j=i;j<=n;j+=i)
            {
                if(era[j])
                    continue;
                era[j] = true;
                ans = j;
                k--;
                if(k==0)
                {
                    cout<<ans<<endl;
                    
                    return 0;
                }
            }
    
}
