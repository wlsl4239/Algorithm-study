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
		int n;
		int arr[101][101];
		int ans = 0;
		cin >> n;

		for (int i = 0;i < n;i++)
			for (int j = 0;j < n;j++)
				cin >> arr[i][j];

		for (int i = 0;i < n-1;i++)	//n
			for (int j = 0;j < n;j++)
			{
				if (arr[i][j] == 1 && arr[i + 1][j] == 0)
				{
					arr[i + 1][j] = 1;
					arr[i][j] = 0;
				}
			}
			
		for (int i = 1;i < n;i++)		//s
			for (int j = 0;j < n;j++)
			{
				if (arr[i][j] == 2 && arr[i - 1][j] == 0)
				{
					arr[i - 1][j] = 2;
					arr[i][j] = 0;
				}
			}
		for (int i = 0;i < n;i++)
		{
			if (arr[0][i] == 2)
				arr[0][i] = 0;
			if (arr[n - 1][i] == 1)
				arr[n - 1][i] = 0;
		}

		for (int i = 0;i < n - 1;i++)
			for (int j = 0;j < n;j++)
				if (arr[i][j] == 1 && arr[i + 1][j] == 2)
					ans++;


		for (int i = 0;i < n;i++) {
			for (int j = 0;j < n;j++) {
				char c;
				if (arr[i][j] == 0)
					c = '.';
				else if (arr[i][j] == 1)
					c = 'N';
				else
					c = 'S';
				cout <<c<< " ";
			}
			cout << endl;
		}



		cout << "#" << test << " " << ans << endl;
	}
}

