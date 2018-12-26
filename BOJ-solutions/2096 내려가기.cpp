#include <cstdio>
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

int gyedan[100001][3];
int dpmax[2][3];
int dpmin[2][3];


int main()
{
	int n;
	scanf("%d",&n);

	for(int i=0;i<n;i++)
		for(int j=0;j<3;j++)
			scanf("%d",&gyedan[i][j]);
	
	dpmax[0][0] = dpmin[0][0] = gyedan[0][0];
	dpmax[0][1] = dpmin[0][1] = gyedan[0][1];
	dpmax[0][2] = dpmin[0][2] = gyedan[0][2];

	for(int i=1;i<=n;i++)
	{
		dpmin[1][0] = min(dpmin[0][0],dpmin[0][1]) + gyedan[i][0];
		dpmin[1][1] = min(dpmin[0][0],dpmin[0][1]);			
		dpmin[1][1] = min(dpmin[1][1],dpmin[0][2]) + gyedan[i][1];
		dpmin[1][2] = min(dpmin[0][2],dpmin[0][1]) + gyedan[i][2];
			  												
		dpmax[1][0] = max(dpmax[0][0],dpmax[0][1]) + gyedan[i][0];
		dpmax[1][1] = max(dpmax[0][0],dpmax[0][1]);			
		dpmax[1][1] = max(dpmax[1][1],dpmax[0][2]) + gyedan[i][1];
		dpmax[1][2] = max(dpmax[0][2],dpmax[0][1]) + gyedan[i][2];

		dpmin[0][0] = dpmin[1][0];
		dpmin[0][1] = dpmin[1][1];
		dpmin[0][2] = dpmin[1][2];
		
		dpmax[0][0] = dpmax[1][0];
		dpmax[0][1] = dpmax[1][1];
		dpmax[0][2] = dpmax[1][2];

	}
	int minn = min(dpmin[1][0],dpmin[1][1]);
	minn = min(minn,dpmin[1][2]);
	int maxx = max(dpmax[1][0],dpmax[1][1]);
	maxx = max(maxx,dpmax[1][2]);	
	printf("%d %d\n",maxx,minn);
}
