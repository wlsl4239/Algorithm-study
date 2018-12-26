#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <cmath>
#include <string.h>
#include <string>
#include <stack>
#include <queue>

using namespace std;

vector<string> person;
vector<char> fn;
int main()
{
    int n;
    cin>>n;
    string s;
    for(int i=0;i<n;i++)
    {
        cin>>s;
        person.push_back(s);
    }
    
    sort(person.begin(),person.end());
    
    char firstname = person[0][0];
    
    int count = 1;
    int ans = 0;
    for(int i=1;i<n;i++)
    {
        if(person[i][0] == firstname)
            count++;
        else if(person[i][0] != firstname)
        {
            count = 1;
            firstname = person[i][0];
        }
        if(count == 5)
        {
            ans ++;
            fn.push_back(firstname);
        }
    }
    if(fn.empty())
        cout<<"PREDAJA";
    else
        for(int i=0;i<fn.size();i++)
            cout<<fn[i];
    cout<<endl;
}
