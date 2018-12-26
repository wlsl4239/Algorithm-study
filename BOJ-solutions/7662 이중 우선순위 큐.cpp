#include <cstdio>
#include <algorithm>
#include <vector>
#include <set>
#include <iostream>
using namespace std;

char Question;
int n;
multiset <int> myset;

int main()
{
	int t;
	int num;
	cin>>t;
	while(t--)
	{
		cin>>n;
		myset.clear();
		while(n--)
		{
			cin>>Question>>num;

			switch(Question)
			{
			case 'I':
				{
					myset.insert(num);
					break;
				}
			case 'D':
				{

					if(num==-1)
					{
						if(myset.empty())
							break;
						auto it1 = myset.begin();
						myset.erase(it1);
					}
					else if(num==1)
					{
						if(myset.empty())
							break;
						myset.erase(--myset.end());
					}
					break;
				}
			}
		}

		auto it3 = myset.end();
		auto it4 = myset.begin();
			if(myset.size())
				cout<<*(--it3)<<" "<<*it4<<endl;
			else
				cout<<"EMPTY"<<endl;
	}
}
