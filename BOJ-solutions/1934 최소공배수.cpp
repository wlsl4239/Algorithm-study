#include <iostream>

using namespace std;


int GCD(int a, int b){

    int z;
    int x = a;
    int y = b;

    while (true)
	{
        z = x %y;
        if (0 == z)
            break;
        x = y;
        y = z;
    }
	return y;
}

int main()
{
	int testcase;
	int a, b;
	int lcm;

	cin>>testcase;
	for(int t=0;t<testcase;t++)
	{
		cin>>a>>b;
		lcm = a*b/GCD(a,b);
		cout<<lcm<<endl;
	}
}
