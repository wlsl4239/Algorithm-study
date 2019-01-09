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
        int a, b;
        cin >> a >> b;
 
        if (a>b)
            cout << "#" << tc << " >\n";
        else if(a==b)
            cout << "#" << tc << " =\n";
        else
            cout << "#" << tc << " <\n";
    }
}
