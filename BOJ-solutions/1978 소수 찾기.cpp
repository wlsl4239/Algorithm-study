#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
#include <array>
using namespace std;

bool era[10000];

int main(){
    era[1] = true;
    for(int i=2;i<10000;i++)
        if(!era[i])
            for(int j=i+i;j<10000;j+=i)
                era[j] = true;
    
    
    int n;
    cin>>n;
    int ans = 0;
    
    for(int i=0;i<n;i++)
    {
        int a;
        cin>>a;
        if(!era[a])
            ans++;
    }
    cout<<ans<<endl;
}
