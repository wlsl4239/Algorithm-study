#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	int r;
	double pi = 3.14159265358979;
    cin>>r;
    
    double taxi = r * r * 2;
    double round = pi * r * r;

	cin.precision(6);
	cout<<fixed<<round<<endl<<taxi<<endl;

}
