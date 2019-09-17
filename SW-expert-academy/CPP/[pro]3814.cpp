#include <iostream>
using namespace std;

int t,n,k;

int main(){
    ios::sync_with_stdio(false);
    cin>>t;
    for(int test=1;test<=t;test++){
        cin>>n>>k;
        long long* arr = new long long[n];
        long long minn = 1<<30;
        long long maxx = -minn;
        for(long long i=0;i<n;i++) {
            cin>>arr[i];
            minn = min(arr[i],minn);
            maxx = max(arr[i],maxx);
        }
        
        maxx = maxx-minn;
        minn = 0;
        long long mid;
        long long ans = maxx;
        while(minn<maxx && maxx-minn>1){
            mid = (minn+maxx)/2;
            
            long long* lu = new long long[n];
            long long* ru = new long long[n];
            long long cnt = 0;
            ru[0] = arr[0];
            lu[n-1] = arr[n-1];
            
            for(int i=1;i<n;i++)
                ru[i] = min(arr[i],ru[i-1]+mid);
            for(int i=n-2;i>=0;i--)
                lu[i] = min(arr[i],lu[i+1]+mid);
            
            for(int i=0;i<n;i++)
                cnt += arr[i] - min(lu[i],ru[i]);
            
            if(cnt<=k){
                maxx = mid;
                ans = min(ans,mid);
            }
            else minn = mid;
            
        }
        cout<<"#"<<test<<" "<<ans<<"\n";
    }
}
