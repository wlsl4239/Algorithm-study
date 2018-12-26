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
int arr[51];

int main()
{
    ios::sync_with_stdio(false);
    
    cin>>n;
    
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    sort(arr,arr+n);
    cout<<arr[0]*arr[n-1];
}



