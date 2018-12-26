//433-A
#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>

using namespace std;

int gcd(int m, int n) {
    return m % n == 0 ? n : gcd(n , m % n);
}


int main()
{
    int a,b,c;
    
    cin>>c;
    
    if(c%2 == 0)
    {
        a = c/2 - 1;
        b = c/2 + 1;
        while(gcd(a,b) != 1)
        {
            a-=1;
            b+=1;
        }
    }
    else
    {
        c--;
        a = c/2;
        b = c/2+1;
    }
    
    cout<<a<<" "<<b<<endl;
}
