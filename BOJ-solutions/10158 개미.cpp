#include <iostream>

using namespace std;



int main()
{
	int w, h;
	int x, y;
	int t;

	int vx = 1;
	int vy = 1;


	cin >> w >> h;
	cin >> x >> y;
	cin >> t;

	while (t--)
	{
		if (x == w)
			vx = -1;
		if (x == 0)
			vx = 1;
		if (y == h)
			vy = -1;
		if (y == 0)
			vy = 1;

		x += vx;
		y += vy;
	}

	cout << x << " " << y << endl;
}
