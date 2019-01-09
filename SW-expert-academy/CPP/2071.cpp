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
        int n;
        int ans = 0;
 
        for (int i = 0;i < 10;i++)
        {
            cin >> n;
            ans += n;
        }
 
        if (ans % 10 >= 5)
            ans += 10 - (ans % 10);
 
        cout << "#" << tc << " " << ans / 10 << "\n";
         
    }
}
