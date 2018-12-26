#include <iostream>
#include <string>
using namespace std;

int a,b;
string s;

int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        cin>>s;
        a = s[0] - 48;
        b = s[2] - 48;
        
        cout<<a+b<<endl;
    }
}
