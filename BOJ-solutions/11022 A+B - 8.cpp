#include <iostream>
#include <string>
using namespace std;

int a,b;
string s;

int main()
{
    int t;
    cin>>t;
    for(int i=1;i<=t;i++)
    {
        cin>>a>>b;
        
        cout<<"Case #"<<i<<": "<<a<<" + "<<b<< " = "<<a+b<<"\n";
    }
}
