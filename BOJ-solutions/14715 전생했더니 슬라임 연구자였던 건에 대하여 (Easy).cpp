#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

int k,ans;
int numberOfPrime;
int a;
int b;

int main()
{
    cin>>k;
    for(int i=2;i<=1000;i++)
    {
        while(k%i == 0)
        {
            numberOfPrime++;
            k /= i;
        }
    }
    if(k!=1)
        numberOfPrime++;
    for(int i=0;i<=20;i++)
    {
        a = 1<<i;
        b = 1<<(i+1);
        if(numberOfPrime>a && numberOfPrime<=b)
        {
            ans = i+1;
            break;
        }
    }
    
    cout<<ans<<endl;
}
