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
#include <cstring>
#include <string.h>
 
using namespace std;
 
int t;
 
int main()
{
    cin >> t;
 
    for (int test = 1;test <= t;test++)
    {
        int ans = 0;
        int n, k;
        vector<int> arr;
 
        cin >> n >> k;
        for (int i = 0;i < n;i++)
        {
            int a;
            cin >> a;
            arr.push_back(a);
        }
        sort(arr.begin(), arr.end());
        for (int i = 1;i <= k;i++)
            ans += arr[n - i];
 
 
 
 
 
        cout << "#" << test <<" "<< ans << endl;
    }
}
