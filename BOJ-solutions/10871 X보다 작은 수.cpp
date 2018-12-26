#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
#include <array>
using namespace std;

vector<int> arr;

int n,m;

int main(){
    cin>>n>>m;
    arr.resize(n+1);
    
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    for(int i=0;i<n;i++)
        if(arr[i]<m)
            cout<<arr[i]<<" ";
    cout<<"\n";
    
}

