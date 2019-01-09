//#1952 수영장

#include <iostream>
#include <algorithm>

using namespace std;

int minn = 1 << 30;
int costarr[4];
int plan[13];

int t;

void func(int mon, int cost)
{
	if (mon >= 12)
	{
		minn = min(minn, cost);
		return;
	}

	func(mon + 1, cost + costarr[0] * plan[mon]);
	func(mon + 1, cost + costarr[1]);
	func(mon + 3, cost + costarr[2]);
	func(mon + 12, cost + costarr[3]);
}
int main()
{
	cin >> t;
	for (int tc = 1;tc <= t;tc++)
	{
		minn = 1 << 30;
		for (int i = 0;i < 4;i++)
			cin >> costarr[i];
		for (int i = 0;i < 12;i++)
			cin >> plan[i];

		func(0, 0);

		cout <<"#" << tc << " " << minn << endl;


	}
}
