#include<iostream>
#include<iomanip>
using namespace std;
double a;
int main(){
    int t;
    cin>>t;
    while(t--){
        cin>>a;
        cout<<fixed<<setprecision(10)<<a/6<<endl;
    }
}
