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
int d, a, b;
bool isPrime[1000010];
 
int main()
{
    memset(isPrime, true, sizeof(isPrime));
    isPrime[0] = false;
    isPrime[1] = false;
 
    for (int i = 2;i < 1000001;i++)
    {
        if (isPrime[i])
            for (int j = i+i;j < 1000001;j += i)
                isPrime[j] = false;
    }
 
    cin >> t;
 
    for (int test = 1;test <= t;test++)
    {
        int ans = 0;
        cin >> d >> a >> b;
 
        for (int j = a;j <= b;j++)
        {
            if (!isPrime[j])
                continue;
            else
            {
                if (j % 10 == d)
                    ans++;
                else if ((j % 100) / 10 == d)
                    ans++;
                else if ((j % 1000) / 100 == d)
                    ans++;
                else if ((j % 10000) / 1000 == d)
                    ans++;
                else if ((j % 100000) / 10000 == d)
                    ans++;
                else if ((j % 1000000) / 100000 == d)
                    ans++;
            }
 
        }
 
        cout << "#" << test <<" "<< ans << endl;
    }
}
