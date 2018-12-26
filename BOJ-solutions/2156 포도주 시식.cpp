#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>
#include <string>

using namespace std;

int DP[3][10001];
int wine[10001];
int main()
{
    int n;
    cin>>n;
    
    for(int i=0;i<n;i++)
        cin>>wine[i];
    
    DP[0][0] = DP[2][0] = 0;
    DP[1][0] = wine[0];
    
    for(int i=1;i<n;i++)
    {
        DP[0][i] = max(DP[0][i-1],DP[1][i-1]);
        DP[0][i] = max(DP[0][i],DP[2][i-1]);
        
        DP[1][i] = DP[0][i-1] + wine[i];
        DP[2][i] = DP[1][i-1] + wine[i];
    }
    
    int winemax = max(DP[0][n-1],DP[1][n-1]);
    winemax = max(winemax,DP[2][n-1]);
    
    cout<<winemax<<endl;
}


