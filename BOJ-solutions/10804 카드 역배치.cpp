#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;



int main()
{

	vector<int> v;

	for(int i=1;i<21;i++)
		v.push_back(i);

	int a, b;

	for (int i = 0;i < 10;i++)
	{
		cin >> a >> b;
		reverse(v.begin()+a-1, v.begin()+b);
	}


	for (int i = 0;i < 20;i++)
	{
		cout << v[i] << " ";
	}
	cout << endl;



}
