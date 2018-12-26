//851-B

#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
#include <cmath>
using namespace std;


int main()
{
	unsigned long long xx1, yy1, xx2, yy2, xx3, yy3;
	cin >> xx1 >> yy1;
	cin >> xx2 >> yy2;
	cin >> xx3 >> yy3;

	if (((yy2 - yy3)*(xx2-xx1) == (xx2 - xx3)*(yy2-yy1)))
		cout << "No" << endl;
	else
	{
		if (((yy2 - yy1)*(yy2 - yy1) + (xx2 - xx1)*(xx2 - xx1)) == ((yy2 - yy3)*(yy2 - yy3) + (xx2 - xx3)*(xx2 - xx3)))
			cout << "Yes" << endl;
		else
			cout << "No" << endl;
	}
}
