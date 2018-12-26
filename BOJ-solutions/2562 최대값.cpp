#include <iostream>
#include <string>
using namespace std;
                                            
int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif
	int num,mmax,a;
	mmax = 0;
	for(int i=0;i<9;i++)
	{
		cin>>num;
		if(mmax<num)
		{
			mmax = num;
			a = i+1;
		}
	}
	cout<<mmax<<endl<<a<<endl;

}
