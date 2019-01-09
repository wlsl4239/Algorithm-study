#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

double ans;
int arr[11][11];
int x,y;
double maxx;
vector<int> v;

int f(int a,int b,int c,int d)
{
    if(arr[a][b] > arr[c][d])
        return 1;
    else
        return 0;
}
int main()
{
    cin>>x>>y;

    for(int i=1;i<11;i++)
        for(int j=1;j<11;j++)
            arr[i][j] = (i+j)%10;
    
    for(int i=1;i<11;i++)
            arr[i][i] = 10+i;
    
    for (int i = 1; i <= 10; i++) {
        v.push_back(i);
        v.push_back(i);
    }
    v.erase(lower_bound(v.begin(), v.end(), x));
    v.erase(lower_bound(v.begin(), v.end(), y));
    
    for (int i = 0; i < v.size(); i++) {
        for (int j = 0; j < v.size(); j++) {
            if (i == j)continue;
            maxx++;
            ans += f(x, y, v[i], v[j]);
        }
    }
    cout.precision(3);
    cout<<fixed<<ans / maxx<<endl;
    
    
}
