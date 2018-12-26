#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;
long long DP[202][202][110];
int dx[8] = {1,1,1,0,-1,-1,-1,0};
int dy[8] = {1,0,-1,-1,-1,0,1,1};
char arr[202][202];
char str[110];
int h,w,l;
int num;

bool ispossible(int x,int y,int idx)
{
	if(x==-1 || y==-1 || x==h || y==w)
		return false;
	return true;
}

long long sol(int cnt,int x,int y)
{
	if(cnt == l)
	{
		return 1;
	}

	long long & ret = DP[x][y][cnt];
	if(ret != 0)
		return ret;
	for(int i=0;i<8;i++)
	{
		int nextx = x+dx[i];
		int nexty = y+dy[i];

		if(ispossible(nextx,nexty,cnt))
		{
			if(arr[nextx][nexty] == str[cnt])
				ret += sol(cnt+1,nextx,nexty);
		}
	}
	return ret;
}
int main()
{
#ifdef _CONSOLE
	freopen("Text.txt","r",stdin);
#endif
	cin>>h>>w>>l;
	long long k = 0;
	for(int i=0;i<h;i++)
	{
		for(int j=0;j<w;j++)
			cin>>arr[i][j];
	}
	for(int i=0;i<l;i++)
		cin>>str[i];

	for(int i=0;i<h;i++)
	{
		for(int j=0;j<w;j++)
		{
			if(arr[i][j] == str[0])
				k += sol(1,i,j);
		}
	}
	cout<<k<<endl;
}
