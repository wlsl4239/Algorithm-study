#include <iostream>

using namespace std;

int a1,a2,a3,a4;
int b1,b2,b3,b4;
int asum,bsum;

int main()
{
    cin>>a1>>a2>>a3>>a4>>b1>>b2>>b3>>b4;
    
    asum = a1+a2+a3+a4;
    bsum = b1+b2+b3+b4;
    
    if(asum>=bsum)
        cout<<asum;
    else
        cout<<bsum;
    cout<<endl;
}
