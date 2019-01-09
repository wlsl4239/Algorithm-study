#include <iostream>
using namespace std;
int main(){
	int h, m;
	cin >> h >> m;
	h %= 30;
	if (m == h * 12)
		cout << "O" << endl;
	else
		cout << "X" << endl;}
