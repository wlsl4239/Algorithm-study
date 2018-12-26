#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int arr[100];
int main(){
    
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 2;
    
    for(int i=3;i<30;i++)
        arr[i] = arr[i-2]+arr[i-1];
    
    int n;
    cin>>n;
    cout<<arr[n-1]<<endl;
}

