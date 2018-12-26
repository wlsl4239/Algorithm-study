//415-B

#include <iostream>
using namespace std;

long long arr[100001];
int main()
{
    long long n,a,b,k;
    
    cin>>n>>a>>b;

    for(int i=0;i<n;i++)
    {   cin>>k;
        cout<<a*k%b/a<<" ";
}
    cout<<endl;
}
