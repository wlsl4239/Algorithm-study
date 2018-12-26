#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
#include <array>
using namespace std;

#define NUM 1000010

bool era[NUM];

int n,m;

int ans;

int main(){
    era[0] = true;
    era[1] = true;
    for(int i=2;i<NUM;i++)
        if(!era[i])
            for(int j=i+i;j<NUM;j+=i)
                era[j] = true;
    while(1){
        cin>>n;
        ans =0;
        if(n==0)
            return 0;
    
        for(int i=n+1;i<=2*n;i++)
            if(!era[i])
                ans++;
        cout<<ans<<endl;
    }
}
