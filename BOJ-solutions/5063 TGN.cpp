#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif
	int t;
	cin>>t;
	int r,e,c;
	while(t--)
	{
		cin>>r>>e>>c;
		if(r<e-c)
			cout<<"advertise"<<endl;
		else if(r>e-c)
			cout<<"do not advertise"<<endl;
		else if(r==e-c)
			cout<<"does not matter"<<endl;
	}
}
