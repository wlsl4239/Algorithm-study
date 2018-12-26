#include <iostream>
#include <string>

using namespace std;

int main()
{
    int n;
    string a;
    
    cin>>n>>a;
    
    int sum = 0;
    
    for(int i=0;i<n;i++)
    {
        sum += (int)a[i] - 48;
    }
    
    cout<<sum<<endl;
}
