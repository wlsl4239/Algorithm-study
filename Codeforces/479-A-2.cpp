//479-A-2

#include <cstdio>
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <string.h>
using namespace std;

int arr[3];

int main()
{
    for(int i=0;i<3;i++)
        cin>>arr[i];
            
    int a = (arr[0]+arr[1])*arr[2];
    int b = arr[0]*(arr[1]+arr[2]);
    int d = arr[0]*arr[1]*arr[2];
    int f = arr[0]+arr[1]+arr[2];
    int sol = max(a,b);
    sol = max(sol,d);
    sol = max(sol,f);
        cout<<sol<<endl;
}
