//479-B-2

#include <cstdio>
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <string.h>
using namespace std;

vector <pair<int,int> > vec;
int arr[101];
int a;

    int n,k;
int findMax()
{
    int maxx = 0;
    int ret;
    for(int i=0;i<n;i++)
    {
        if(maxx < arr[i])
        {
            ret = i;
            maxx = arr[i];
        }
    }
    return ret;
}
int findMin()
{
    int minn = 9999999;
    int ret;
    for(int i=0;i<n;i++)
    {
        if(minn > arr[i])
        {
            ret = i;
            minn = arr[i];
        }
    }
    return ret;
}
int main()
{
    cin>>n>>k;

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int s;
    int m = 0;
    
        int mmaxx = findMax();
        int mminn = findMin();
    
    while(1)
    {
        mmaxx = findMax();
        mminn = findMin();
    
        s = arr[mmaxx] - arr[mminn];
        if(s == 1 || s == 0 || (m == k))
         
