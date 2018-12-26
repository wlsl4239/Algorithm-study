#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<cmath>

int n, m;

int pack[101];
int one[101];

int ans;
using namespace std;
int main(){
    cin>>n>>m;
    int minp = 10000;
    int mino = 10000;
    for(int i=0;i<m;i++)
    {
        cin>>pack[i]>>one[i];
        minp = min(pack[i],minp);
        mino = min(one[i],mino);
    }
    
    int a = (n/6) * minp + minp;
    int b = (n/6) * minp + (n%6) * mino;
    int c = n * mino;
    
    ans = min(a,b);
    ans = min(ans,c);
    
    cout<<ans<<endl;
    
    
}
