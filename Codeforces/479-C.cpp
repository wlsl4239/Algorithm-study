//479-C

#include <cstdio>
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <string.h>
using namespace std;


int n;
vector <pair<int,int> > vec;

int main()
{
    cin >> n;
    for(int i=0;i<n;i++)
    {
        int b,c;
        cin>>b>>c;
        vec.push_back(make_pair(b,c));
    }
    sort(vec.begin(),vec.end());
    int day = 0;
    for(int i=0;i<n;i++)
    {
        int a = vec[i].first;
        int b = vec[i].second;
        if(b>=day && a>=day)
            day = b;
        else
            day = a;
    }
    cout<<day<<endl;
    
}
