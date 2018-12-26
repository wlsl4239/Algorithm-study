#include <iostream>
#include <string>
using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	int ans = (a*b) - c;

	if (ans < 0)
		ans = 0;
	cout << ans << endl;
}
