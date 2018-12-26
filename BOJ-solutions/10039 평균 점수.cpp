#include <iostream>
#include <algorithm>
#include <string.h>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>

using namespace std;

int arr[8];
int main(){
    int ans = 0;
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
        if(arr[i]<40)
            arr[i] = 40;
        ans += arr[i];
    }
    
    
    cout<<ans/5<<endl;
}
