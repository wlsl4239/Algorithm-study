#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
#include <cmath>
#include <tuple>

using namespace std;

int main()
{
    int n;
    cin>>n;
    if(n>=90 && n<=100)
        cout<<"A"<<endl;
    else if(n>=80 && n<90)
        cout<<"B"<<endl;
    else if(n>=70 && n<80)
        cout<<"C"<<endl;
    else if(n>=60 && n<70)
        cout<<"D"<<endl;
    else
        cout<<"F"<<endl;
}
