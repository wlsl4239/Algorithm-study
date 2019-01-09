#include <iostream>
#include <cstdio>
#include <algorithm>
#include <queue>
#include <vector>
#include <stack>
#include <sstream>
#include <list>
#include <cmath>
using namespace std;
 
int n;
 
int t;
 
int main()
{
    ios::sync_with_stdio(false);
     
    cin>>t;
     
    for(int test=1;test<=t;test++){
        string s;
        cin>>s;
         
        if(s.size()==1)
        {
            cout<<"..#..\n";
            cout<<".#.#.\n";
            cout<<"#."<<s<<".#\n";
            cout<<".#.#.\n";
            cout<<"..#..\n";
        }
        else
        {
            cout<<".";
            for(int i=0;i<s.size();i++)
                cout<<".#..";
            cout<<"\n";
             
            cout<<".";
            for(int i=0;i<s.size();i++)
                cout<<"#.#.";
            cout<<"\n";
             
            cout<<"#";
            for(int i=0;i<s.size();i++)
                cout<<"."<<s[i]<<".#";
            cout<<"\n";
             
            cout<<".";
            for(int i=0;i<s.size();i++)
                cout<<"#.#.";
            cout<<"\n";
             
            cout<<".";
            for(int i=0;i<s.size();i++)
                cout<<".#..";
            cout<<"\n";
             
             
             
             
             
        }
         
    }
}
