#include<iostream>
#include<stack>
#include<string>
using namespace std;


bool isPair(const string& str)
{
    
    stack<char> s;
    for(int j=0;j<str.length();j++)
    {
        if(s.empty())
        {
            s.push(str[j]);
            continue;
        }
        if((str[j]=='A' && s.top()=='A') || (str[j]=='B' && s.top()=='B'))
            s.pop();
        
        else
            s.push(str[j]);
    }
    
    if(s.empty())
        return true;
    else
        return false;
}

int main()
{
    int t;
    string strr[110];
    
    cin>>t;
    
    int count = 0;
    for(int i=0;i<t;i++)
    {
        cin>>strr[i];
        if(isPair(strr[i])==true)
            count++;
    }
    cout<<count<<endl;
}
