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

int e,s,m;

int arr[16][29][20];

int ans;

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>e>>s>>m;
    
    for(int i=1;i<=15*19*28;i++)
        arr[i%15][i%28][i%19] = i;
    
    if(e==15)
        e = 0;
    if(s==28)
        s = 0;
    if(m==19)
        m = 0;
    
    cout<<arr[e][s][m];
}



