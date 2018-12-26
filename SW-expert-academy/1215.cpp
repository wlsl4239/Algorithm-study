#include <iostream>
#include <cstdio>
#include <algorithm>
#include <queue>
#include <vector>
#include <stack>
#include <sstream>
#include <list>
#include <cmath>
#include <tuple>
#include <cstring>
#include <string.h>
#include <limits>

using namespace std;

int t;

int main()
{
	
	//cin >> t;

	for (int test = 1;test <= 10;test++)
	{
		int num;
		char arr[8][8];
		int ans = 0;

		cin >> num;
		for (int i = 0;i < 8;i++)
			for (int j = 0;j < 8;j++)
				cin >> arr[i][j];

		for (int k = 0;k < 8;k++) 
		{
			for (int i = 0;i <= 8 - num;i++)
			{
				bool flag1 = false;
				bool flag2 = false;

				for (int j = 0;j < num / 2;j++)
				{
					if (arr[k][i + j] != arr[k][i + (num - j-1)])
						break;
					if(j== num / 2 - 1)
						flag1 = true;
				}

				for (int j = 0;j < num / 2;j++)
				{
					if (arr[i + j][k] != arr[i + (num - j-1)][k])
						break;
					if (j == num / 2 - 1)
						flag2 = true;
				}

				if (flag1)
					ans++;
				if (flag2)
					ans++;
			}
		}


		cout << "#" << test << " " << ans << endl;
	}
}

