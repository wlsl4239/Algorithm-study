#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int n;
int ans;

int main()
{
    cin>>n;
    
    n = 1000-n;
    
    ans += n/500;
    n%=500;
    ans += n/100;
    n%=100;
    ans+= n/50;
    n%=50;
    ans+=n/10;
    n%=10;
    ans+=n/5;
    n%=5;
    ans+=n/1;
    
    cout<<ans<<endl;
}
