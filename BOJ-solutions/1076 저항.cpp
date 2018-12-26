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

string a,b,c;
vector<pair<string,pair<int,int>>> vec;

int main()
{
    ios::sync_with_stdio(false);
    
    vec.push_back(make_pair("black",make_pair(0,1)));
    vec.push_back(make_pair("brown",make_pair(1,10)));
    vec.push_back(make_pair("red",make_pair(2,100)));
    vec.push_back(make_pair("orange",make_pair(3,1000)));
    vec.push_back(make_pair("yellow",make_pair(4,10000)));
    vec.push_back(make_pair("green",make_pair(5,100000)));
    vec.push_back(make_pair("blue",make_pair(6,1000000)));
    vec.push_back(make_pair("violet",make_pair(7,10000000)));
    vec.push_back(make_pair("grey",make_pair(8,100000000)));
    vec.push_back(make_pair("white",make_pair(9,1000000000)));
    
    long long ans = 0;
    
    cin>>a>>b>>c;
    
    for(int i=0;i<10;i++)
    {
        if(a == vec[i].first)
            ans += vec[i].second.first * 10;
    }
    for(int i=0;i<10;i++)
    {
        if(b == vec[i].first)
            ans += vec[i].second.first;
    }
    for(int i=0;i<10;i++)
    {
        if(c == vec[i].first)
            ans *= vec[i].second.second;
    }
    cout<<ans;
    
}



