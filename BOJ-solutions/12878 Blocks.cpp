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
using namespace std;

int pow(int nn) {
	if (nn == 0) {
		return 1;
	}
	else {
		long temp = pow(nn / 2)%10007;
		if (nn % 2 == 0)
			return temp*temp;
		else
			return temp*temp * 2;
	}
}


int main()
{
	int n;
	

	cin >> n;
	
	int num = pow(n - 1)%10007;


	cout << (num*(num - 1) + 2 * num)%10007;
	

}
