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

int arr[101][101];

void setCallender()
{
    arr[1][1] = 4;
    for(int i=2;i<=31;i++)
        arr[1][i] = (arr[1][i-1]+1)%7;
    arr[2][1] = (arr[1][31]+1)%7;
    for(int i=2;i<=29;i++)
        arr[2][i] = (arr[2][i-1]+1)%7;
    arr[3][1] = (arr[2][29]+1)%7;
    for(int i=2;i<=31;i++)
        arr[3][i] = (arr[3][i-1]+1)%7;
    arr[4][1] = (arr[3][31]+1)%7;
    for(int i=2;i<=30;i++)
        arr[4][i] = (arr[4][i-1]+1)%7;
    arr[5][1] = (arr[4][30]+1)%7;
    for(int i=2;i<=31;i++)
        arr[5][i] = (arr[5][i-1]+1)%7;
    arr[6][1] = (arr[5][31]+1)%7;
    for(int i=2;i<=30;i++)
        arr[6][i] = (arr[6][i-1]+1)%7;
    arr[7][1] = (arr[6][30]+1)%7;
    for(int i=2;i<=31;i++)
        arr[7][i] = (arr[7][i-1]+1)%7;
    arr[8][1] = (arr[7][31]+1)%7;
    for(int i=2;i<=31;i++)
        arr[8][i] = (arr[8][i-1]+1)%7;
    arr[9][1] = (arr[8][31]+1)%7;
    for(int i=2;i<=30;i++)
        arr[9][i] = (arr[9][i-1]+1)%7;
    arr[10][1] = (arr[9][30]+1)%7;
    for(int i=2;i<=31;i++)
        arr[10][i] = (arr[10][i-1]+1)%7;
    arr[11][1] = (arr[10][31]+1)%7;
    for(int i=2;i<=30;i++)
        arr[11][i] = (arr[11][i-1]+1)%7;
    arr[12][1] = (arr[11][30]+1)%7;
    for(int i=2;i<=31;i++)
        arr[12][i] = (arr[12][i-1]+1)%7;
    
}

int main()
{
    ios::sync_with_stdio(false);
    cin>>t;

    setCallender();
    for(int test = 1;test<=t;test++)
    {
        int m,d;
        cin>>m>>d;
        
        cout<<"#"<<test<<" "<<arr[m][d]<<"\n";
        
    }
    
}



