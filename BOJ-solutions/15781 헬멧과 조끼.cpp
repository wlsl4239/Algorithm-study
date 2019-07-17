#include <iostream>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int a=0, b=0;
    for(int i=0;i<n;i++){
        int c;
        cin>>c;
        a = (a<c)?c:a;
    }
    for(int j=0;j<m;j++){
        int d;
        cin>>d;
        b = (b<d)?d:b;
    }
    cout<<a+b<<endl;
}

