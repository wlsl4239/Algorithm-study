#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int arr[3];
    
    int a;
    
    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 1;
    
    cin>>a;
    
    for(int i=2;i<a;i++)
    {
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = arr[0]+arr[1];
    }
    
    cout<<arr[2]<<endl;
}
