#include <iostream>

using namespace std;

int main()
{
    
    int a;
    
    int c[5];

    cin>>a;
    
    int num = 0;

    for(int i=0;i<5;i++)
    {
        cin>>c[i];
        if(a == c[i])
            num++;
    }
    cout<<num<<endl;
}
