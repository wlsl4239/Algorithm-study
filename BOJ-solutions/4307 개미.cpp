#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int n,l;
int t;
int d;

int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif
	cin>>t;
	while(t--)
	{
		int s1=0,s2=0,ss,bb;
		cin>>l>>n;
		while(n--)
		{
			cin>>d;
			ss = min(d,l-d);
			bb = max(d,l-d);
			s1 = max(s1,ss);
			s2 = max(s2,bb);
		}
		cout<<s1<<" "<<s2<<endl;
	}

}
