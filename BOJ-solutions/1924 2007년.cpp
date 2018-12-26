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

int t;
int x,y;

vector<pair<int,int>> vec;

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>x>>y;
    
    for(int i=1;i<=12;i++)
    {
        int day;
        if(i==2)
            day = 28;
        else if(i==4 || i==6 || i==9 || i==11)
            day = 30;
        else
            day = 31;
        
        for(int j=1;j<=day;j++)
            vec.push_back({i,j});
    }
    
    int idx;
    for(int i=0;i<vec.size();i++)
        if(vec[i].first == x && vec[i].second == y)
            idx = i;
    
    switch(idx%7)
    {
        case 0:
            cout<<"MON";
            break;
            
        case 1:
            cout<<"TUE";
            break;
            
        case 2:
            cout<<"WED";
            break;
            
        case 3:
            cout<<"THU";
            break;
            
        case 4:
            cout<<"FRI";
            break;
            
        case 5:
            cout<<"SAT";
            break;
            
        case 6:
            cout<<"SUN";
            break;
    }
    
    
}



