#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int arr[15];
int main(){
    
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 2;
    
    for(int i=3;i<15;i++)
        arr[i] = i*arr[i-1];
    
    int n;
    cin>>n;
    cout<<arr[n]<<endl;
}

