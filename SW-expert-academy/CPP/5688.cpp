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
#include <time.h>
#include <map>
using namespace std;


int main(void)
{
	int t;
	cin >> t;

	map<long long, long long> st;

	for (long long i = 1;i <= 1000000;i++)
		st.insert({ i*i*i,i });


	for (int test = 1;test <= t;test++)
	{

		long long n;
		cin >> n;
		
		if (st.find(n) == st.end())
			cout << "#" << test << " -1\n";
		else
			cout << "#" << test << " " << st[n] << endl;

		
	}

}
