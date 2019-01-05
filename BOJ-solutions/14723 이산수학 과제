#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

vector<pair<int,int>> vec;

int main()
{
    for(int i=2;i<50;i++)
    {
        for(int j=1;j<i;j++)
        {
            vec.push_back(make_pair(i-j,j));
        }
    }
    int n;
    cin>>n;
    
    cout<<vec[n-1].first<<" "<<vec[n-1].second<<endl;
    
}
