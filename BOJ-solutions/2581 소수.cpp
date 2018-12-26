#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
#include <array>
using namespace std;

#define NUM 20000

bool era[NUM];

int n,m;

int minp = 1e9;
int sum = -1;

int main(){
    era[1] = true;
    for(int i=2;i<NUM;i++)
        if(!era[i])
            for(int j=i+i;j<NUM;j+=i)
                era[j] = true;
    
    cin>>n>>m;
    
    for(int i=n;i<=m;i++)
    {
        if(!era[i])
        {
            minp = min(minp,i);
            sum+=i;
        }
    }
    
    if(sum == -1)
        cout<<"-1"<<endl;
    else
        cout<<sum+1<<" "<<minp<<endl;
    
}
