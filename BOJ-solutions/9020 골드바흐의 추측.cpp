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

int n;

int main(){
    era[0] = true;
    era[1] = true;
    for(int i=2;i<NUM;i++)
        if(!era[i])
            for(int j=i+i;j<NUM;j+=i)
                era[j] = true;
 
    cin>>n;
    while(n--)
    {
        int a;
        cin>>a;
        
        for(int i=a/2;i>1;i--)
        {
            if(!era[i]){
                if(!era[a-i])
                {
                    cout<<i<<" "<<a-i<<endl;
                    break;
                }
            }
        }
        
    }
}
