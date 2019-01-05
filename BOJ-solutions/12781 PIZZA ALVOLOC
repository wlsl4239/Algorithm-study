#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
#include <cmath>
#include <tuple>
#include <fstream>
#define N 1020

using namespace std;


int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
	int temp = x1*y2 + x2*y3 + x3*y1;
	temp = temp - y1*x2 - y2*x3 - y3*x1;
	if (temp > 0) {
		return 1;
	}
	else if (temp < 0) {
		return -1;
	}
	else {
		return 0;
	}
}

int main()
{
//	freopen("input.txt", "r", stdin);
//	freopen("output.txt", "w", stdout);

	int a, b, c, d, e, f, g, h;

	cin >> a >> b >> c >> d >> e >> f >> g >> h;

	if (ccw(a, b, c, d, e, f) * ccw(a, b, c, d, g, h) == -1)
		cout << "1" << endl;
	else
		cout << "0" << endl;;

}
