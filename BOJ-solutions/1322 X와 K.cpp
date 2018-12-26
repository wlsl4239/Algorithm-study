#include <iostream>

using namespace std;

long long x,k,y;

int main()
{
    
    cin>>x>>k;
    
    for(int i=0,j=0;j<32;i++,j++)
    {
        while((1LL<<i)&x)
            i++;
        if((1LL<<j)&k)
            y+=(1LL<<i);
    }
    cout<<y<<endl;
}
