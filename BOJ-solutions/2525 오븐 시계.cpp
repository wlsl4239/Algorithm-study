#include <iostream>
#include <string>
using namespace std;



int main()
{
	int h, m;

	int time;

	cin >> h >> m;
	cin >> time;

	m += time;

	if (m >= 60)
	{
		h += m / 60;
		m = m % 60;
		h = h % 24;
	}

	cout << h << " " << m << endl;

}
