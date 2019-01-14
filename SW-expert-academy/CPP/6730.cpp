#include <iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    for(int test = 1;test<=t;test++){
     	int n;
		int up = 0;
	    int down = 0;
        int arr[101];
        
    	cin>>n;
        
        for(int i=0;i<n;i++)
            cin>>arr[i];
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1])
            	down = max(down,arr[i]-arr[i+1]);
            else
                up = max(up,arr[i+1]-arr[i]);
               }
        cout<<"#"<<test<<" "<<up<<" "<<down<<"\n";
    }
}
