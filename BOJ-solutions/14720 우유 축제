#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int milk[1001];
int maxx;
int n;
int main()
{
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>milk[i];
    
    int nowmilk = 0;
    
    
    for(int i=0;i<n;i++)
    {
        if(milk[i] == nowmilk)
        {
            maxx ++;
            nowmilk++;
            nowmilk %= 3;
        }
    }
    
    cout<<maxx<<endl;
}
