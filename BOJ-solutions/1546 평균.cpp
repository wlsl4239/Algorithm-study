#include <iostream>

using namespace std;

int main()
{
    
    int n;
    double arr[1000];
    double max = 0;
    double avg = 0;
    cin>>n;
    
    for(int i=0;i<n;i++){
        cin>>arr[i];
        
        if(max<arr[i])
            max = arr[i];
        avg+= arr[i];
    }
    
    avg /= n;
    avg /= max;
    avg *= 100;
    
    cout.precision(2);
    cout<<fixed<<avg<<endl;
    
    
}
