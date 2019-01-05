#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int n;
bool arr[1000][1000];
int xx1,xx2,yy1,yy2;

int ans;

int main()
{
    cin>>n;
    
    while(n--)
    {
        cin>>xx1>>yy1>>xx2>>yy2;
        
        for(int i=xx1;i<xx2;i++)
            for(int j=yy1;j<yy2;j++)
                arr[i][j] = true;
    }
    for(int i=0;i<1000;i++)
        for(int j=0;j<1000;j++)
            if(arr[i][j])
                ans++;
    
    cout<<ans<<endl;
}
