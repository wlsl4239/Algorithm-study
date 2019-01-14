#include <iostream>

using namespace std;

int main()
{
	
    int t;
    cin>>t;
    for(int test = 1;test<=t;test++){
     	int n;
        double ans = 0;
        int pay;
        double prob;
        
        cin>>n;
        for(int i=0;i<n;i++){
            cin>>prob>>pay;
            ans += (prob * pay);
        }
        cout.precision(6);
        cout<<fixed<<"#"<<test<<" "<<ans<<endl;
        
        
    }
}
