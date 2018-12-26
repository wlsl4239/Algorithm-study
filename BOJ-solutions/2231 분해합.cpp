#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int n,ans;

int main(){
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        int a = i;
        int b = i;
        while(a>0)
        {
            b+= a%10;
            a/=10;
        }
        
        if(n==b){
            ans = i;
            break;
        }
    }
    cout<<ans<<endl;
}

