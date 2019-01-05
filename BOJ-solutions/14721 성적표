#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>

using namespace std;

int n;
vector<pair<int,int>> xy;
long long rss = 1e9;
int nowa,nowb;

int main(){
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        int a,b;
        cin>>a>>b;
        xy.push_back(make_pair(a,b));
        
    }
    long long num = 0;
    for(int a=1;a<=100;a++)
    {
        for(int b=1;b<=100;b++)
        {
            num = 0;
            for(int i=0;i<n;i++)
                num += pow((xy[i].second - (a*xy[i].first + b)),2);  //(y-(ax+b))^2
            
            if(rss > num)
            {
                rss = num;
                nowa = a;
                nowb = b;
            }
        }
    }
    
    cout<<nowa<<" "<<nowb<<endl;
}
