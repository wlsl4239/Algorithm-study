#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int t[100];
bool isok[10100];

int main(){
    
    for(int i=1;i<64;i++)
        t[i] = i*(i+1)/2;
    
    
    int tc;
    cin>>tc;
    while(tc--)
    {
        for(int i=1;i<64;i++)
            for(int j=1;j<64;j++)
                for(int k=1;k<64;k++)
                    isok[t[i]+t[j]+t[k]] = true;
        int n;
        cin>>n;
        
        cout<<isok[n]<<endl;
    }
    
    
}

