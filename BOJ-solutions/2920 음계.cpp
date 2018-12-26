#include <iostream>
#include <algorithm>
#include <string.h>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>

using namespace std;

string s;
int asc[8] = {1,2,3,4,5,6,7,8};
int des[8] = {8,7,6,5,4,3,2,1};
int arr[8];
string ans = "mixed";
int main(){
    
    for(int i=0;i<8;i++)
        cin>>arr[i];
    
    for(int i=0;i<8;i++)
    {
        if(asc[i] != arr[i])
            break;
        if(i==7)
            ans = "ascending";
    }
    for(int i=0;i<8;i++)
    {
        if(des[i] != arr[i])
            break;
        if(i==7)
            ans = "descending";
    }
    
    cout<<ans<<endl;
}
