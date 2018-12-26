#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
using namespace std;

int n;
queue<int> q;
int main()
{
	cin >> n;
	string query;
	while (n--)
	{
		cin >> query;
		if (query == "push")
		{
			int a;
			cin >> a;
			q.push(a);
		}
		else if (query == "pop")
		{
			if (!q.empty())
			{
				cout << q.front() << endl;
				q.pop();
			}
			else
				cout << "-1" << endl;
		}
		else if (query == "size")
			cout << q.size() << endl;
		else if (query == "empty")
			if (q.empty())
				cout << "1" << endl;
			else
				cout << "0" << endl;
		else if (query == "front")
		{
			if (!q.empty())
			cout << q.front() << endl;
			else
				cout << "-1" << endl;
		}
		else if (query == "back")
		{
			if (!q.empty())
			cout << q.back() << endl;
			else
				cout << "-1" << endl;
		}
	}
}
