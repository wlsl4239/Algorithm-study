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
	int scoreY=0;
	int scoreK=0;
	int y,k;
	while(t--)
	{
		for(int i=0;i<9;i++)
		{
			cin>>y>>k;
			scoreY += y;
			scoreK += k;
		}
		if(scoreY<scoreK)
			cout<<"Korea"<<endl;
		else if(scoreY>scoreK)
			cout<<"Yonsei"<<endl;
		else if(scoreY==scoreK)
			cout<<"Draw"<<endl;
	}
}
