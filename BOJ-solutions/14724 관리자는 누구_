#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int score;
int n;
int maxx;
int maxi;
string clubname[9] = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
int main()
{
    cin>>n;
    
    for(int i=0;i<9;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>score;
            
            if(maxx < score)
            {
                maxx = score;
                maxi = i;
            }
        }
    }
    
    cout<<clubname[maxi]<<endl;
}
