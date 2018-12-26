#include <iostream>

using namespace std;

int main()
{
	 int t;
    char a[100];
    int error;
     
    cin>>t;
 
    for(int i=0;i<t;i++)
    {
        cin>>error>>a;
        for(int j=error;j<100;j++)
		{
			a[j-1]=a[j];
		}
        cout<<a<<endl;
    }
    return 0;
}
