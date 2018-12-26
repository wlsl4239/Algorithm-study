#include <iostream>
#include <string>

using namespace std;

int main()
{

	int t;
	string a;
	int error;
	
	cin>>t;

	for(int i=0;i<t;i++)
	{
		cin>>error>>a;
		a.erase(a.begin()+error-1);
		cout<<a<<endl;
	}
    return 0;
}
