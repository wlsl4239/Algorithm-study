#include <iostream>
#include <algorithm>
using namespace std;
int main()
{

	int arr[3];
	while(1)
	{
    cin>>arr[0]>>arr[1]>>arr[2];

	if(arr[0]==0 && arr[1]==0 && arr[2]==0)
		return 0;

    sort(arr,arr+3);
    
    if(arr[2]*arr[2] == arr[0]*arr[0] + arr[1]*arr[1])
        cout<<"right"<<endl;
    else
        cout<<"wrong"<<endl;
	}
}
