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

string a,b;
string minin,minax,maxin,maxax;
vector<int> arr;

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>a>>b;
    
    minin = a;
    minax = a;
    maxin = b;
    maxax = b;
    
    for(int i=0;i<a.size();i++)
        if(minin[i] == '6')
            minin[i] = '5';
    for(int i=0;i<a.size();i++)
        if(minax[i] == '5')
            minax[i] = '6';
    for(int i=0;i<b.size();i++)
        if(maxin[i] == '6')
            maxin[i] = '5';
    for(int i=0;i<b.size();i++)
        if(maxax[i] == '5')
            maxax[i] = '6';
    
    arr.push_back(stoi(minin));
    arr.push_back(stoi(minax));
    arr.push_back(stoi(maxin));
    arr.push_back(stoi(maxax));
    
    sort(arr.begin(),arr.end());
    
    cout<<arr[0]+arr[2]<<" "<<arr[3]+arr[1];
    
}



