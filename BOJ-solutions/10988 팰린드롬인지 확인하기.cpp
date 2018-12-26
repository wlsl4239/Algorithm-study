#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s;
    cin>>s;
    for(int i=0;i<s.size()/2;i++)
    {
        if(s[i] != s[s.size()-1-i])
        {
            cout<<"0";
            return 0;
        }
    }
    cout<<"1";
    return 0;
    
}
