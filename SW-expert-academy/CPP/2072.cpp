#include <iostream>
#include <cstdio>
#include <algorithm>
#include <queue>
#include <vector>
#include <stack>
#include <sstream>
#include <list>
#include <cmath>
#include <tuple>
using namespace std;
 
int t;
 
int main()
{
    ios::sync_with_stdio(false);
 
    cin >> t;
 
    for (int tc = 1;tc <= t;tc++)
    {
        short int n;
        short int ans = 0;
 
        for (short int i = 0;i < 10;i++)
        {
            cin >> n;
            if (n % 2 == 1)
                ans += n;
        }
 
        cout << "#" << tc << " "<<ans<<"\n";
    }
}
