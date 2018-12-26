#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>

using namespace std;

int arr[10];
int a,b,c;

int main(){
    cin>>a>>b>>c;
    int n = a*b*c;
    
    while(n>0)
    {
        arr[n%10]++;
        n/=10;
    }
    
    for(int i=0;i<10;i++)
        cout<<arr[i]<<endl;
}
