#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int world[550][550];

int h,w;
int ans;
int wide[501];
bool swit;
int main()
{
    cin>>h>>w;
    
    for(int i=0;i<w;i++)
        cin>>wide[i];
    
    for(int i=0;i<w;i++)
    {
        for(int j=0;j<wide[i];j++)
        {
            world[i][j] = 1;
        }
    }
    for(int i=0;i<h;i++)
    {
        int cnt = 0;
        for(int j=0;j<w-1;j++)
        {
            if(world[j][i] == 1 && world[j+1][i] == 0 && !swit)
            {
                swit = true;
                
            }
            else if(world[j][i] == 0 && swit)
            {
                cnt++;
                if( world[j+1][i] == 1 )
                {
                    swit = false;
                    ans += cnt;
                    cnt = 0;
                }
            }
        }
        swit = false;
    }
    
    cout<<ans<<endl;
}
