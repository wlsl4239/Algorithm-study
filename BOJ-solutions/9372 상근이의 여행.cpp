#include <iostream>
using namespace std;

int main()
{
    int t,a,b,v,e;
    cin>>t;
    while(t--)
    {
        cin>>v>>e;
        for(int i=0;i<e;i++)
        cin>>a>>b;
        
        cout<<v-1<<endl;
    }
}
