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

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>t;
    
    for(int i=0;i<t;i++)
    {
        for(int j=t-i;j<t;j++)
            cout<<" ";
        for(int j=0;j<t-i;j++)
            cout<<"*";
        
        cout<<"\n";
    }
    
}



