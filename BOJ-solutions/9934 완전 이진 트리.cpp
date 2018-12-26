#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;

int arr[1025];
int k;
vector<int> vec[11];


int main()
{
    cin>>k;
    int n = pow(2,k) - 1;
    int mul = 2;
    int first = 0;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    for(int i=k;i>0;i--)
    {
        for(int j=0;j<pow(2,i-1);j++)
        {
            vec[i].push_back(arr[first + mul*j]);
        }
        mul*=2;
        first = pow(2,k-i+1)-1;
    }
    
    for(int i=1;i<=k;i++)
    {
        for(int j=0;j<vec[i].size();j++)
            cout<<vec[i][j]<<" ";
        
        cout<<"\n";
    }
    
        
}
