#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int a,b;
string s;

int main()
{
    int maxx = 0;
    int nowp = 0;
    for(int i=0;i<4;i++)
    {
        cin>>a>>b;
        nowp -= a;
        nowp += b;
        maxx = max(maxx,nowp);
        
    }
    cout<<maxx<<endl;
}
