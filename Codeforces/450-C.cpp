//450-C

#include <iostream>
#include <string>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;
 

int main(){
    long long n,m,k;

    cin>>n>>m>>k;
    
    if(n > m) 
        swap(n,m);
    if(k > n+m-2)
        puts("-1");
    else
    {
        long long t1 = max((long long)1 , 2+k-n);
        long long t2 = min(1+k , m);
        t1 = (m / t1) * (n / (2 + k - t1));
        t2 = (m/t2)*(n/(2+k-t2));

        
        cout<<max(t1,t2)<<endl;
    }
}
