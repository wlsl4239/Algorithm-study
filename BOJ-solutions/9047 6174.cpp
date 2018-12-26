#include <iostream>
#include <map>
#include <algorithm>
#include <string>
#include <vector>
using namespace std;

map <int,int> cache;

int sofs(int num)
{
	if(num==6174) return 0;

	if(cache.count(num)==1) return cache[num];

	string str = to_string((long long)num);

	while(str.size()<4) str+='0';
	sort(str.begin(),str.end());
	int minn = stoi(str,0,10);		//(str[0]-'0' * 1000) + (str[1]-'0' * 10) + (str[2]-'0' * 100) + str[3];
	reverse(str.begin(),str.end());
	int maxx = stoi(str,0,10);		//(str[0]-'0' * 1000) + (str[1]-'0' * 10) + (str[2]-'0' * 100) + str[3];

	return cache[num] = 1 + sofs(maxx-minn);
}

int main()
{
	int x;
	int t;
	cin>>t;
	while(t--)
	{
		cin >> x;
		cout<<sofs(x)<<endl;
		
	}
}
