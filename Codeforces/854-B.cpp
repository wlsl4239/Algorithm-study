//854-B

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>

int n,k,maxx,minn;


using namespace std;
int main(){
    cin>>n>>k;
    
    if(n==k || k==0)
    {
        maxx = 0;
        minn = 0;
    }
    else
    {
        minn = 1;
        if(n/3<k)
        {
            maxx = n-k;
        }
        else
            maxx = 2*k;
    }
    
    cout<<minn<<" "<<maxx<<endl;
    
}
