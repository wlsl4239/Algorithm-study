//450-B

#include <iostream>
#include <string>
#include <vector>
#include <queue>
using namespace std;
 

int main(){
    long long x,y;
    cin>>x>>y;
    int n;
    cin>>n;
    int sol;
    switch(n%6)
    {
    case 1:
        {
            sol = (x) % 1000000007;
            if(sol<0)
                sol += 1000000007;
            break;
        }
    case 2:
        {
            sol = (y) % 1000000007;
            if(sol<0)
                sol += 1000000007;
            break;
        }
    case 3:
        {
            sol = (y-x) % 1000000007;
            if(sol<0)
                sol += 1000000007;
            break;
        }
    case 4:
        {
            sol = (-x) % 1000000007;
            if(sol<0)
                sol += 1000000007;
            break;
        }
    case 5:
        {
            sol = (-y) % 1000000007;
            if(sol<0)
                sol += 1000000007;
            break;
        }
    case 0:
        {
            so
