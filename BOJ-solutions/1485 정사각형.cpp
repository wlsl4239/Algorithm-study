#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;


vector<pair<int,int>> vec;
vector<int> dis;
int t;

double distance(pair<int,int> A, pair<int,int> B)
{
    int ret = sqrt((A.first-B.first) * (A.first-B.first) + (A.second-B.second) *(A.second-B.second));
    return ret;
}
int main(){
    
    cin >> t;
    
    while(t--)
    {
        dis.clear();
        vec.clear();
        vec.resize(4);
        for(int i=0;i<4;i++)
            cin>>vec[i].first>>vec[i].second;
        
        sort(vec.begin(),vec.end());
        
        int a,b,c,d,e,f;
        
        a = distance(vec[0],vec[1]);
        b = distance(vec[0],vec[2]);
        c = distance(vec[0],vec[3]);
        d = distance(vec[1],vec[2]);
        e = distance(vec[1],vec[3]);
        f = distance(vec[2],vec[3]);
        
        dis.push_back(a);
        dis.push_back(b);
        dis.push_back(c);
        dis.push_back(d);
        dis.push_back(e);
        dis.push_back(f);
        
        sort(dis.begin(),dis.end());
        
        int minn = dis[0];
        int maxx = dis[5];
        
        if(dis[0] == minn && dis[1] == minn && dis[2] == minn && dis[3] == minn && dis[4] == maxx && dis[5] == maxx)
            cout<<"1"<<endl;
        else
            cout<<"0"<<endl;
    }
    
}



