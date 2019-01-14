#include<iostream>

using namespace std;

int main()
{
	int test_case;
	int T;
	cin>>T;
	for(test_case = 1; test_case <= T; ++test_case)
	{
        int a,ans;
        scanf("%d",&a);
        
        if(a<100)
            ans = 0;
        else if(a<1000)
            ans = 1;
        else if(a<10000)
            ans = 2;
        else if(a<100000)
            ans = 3;
        else if(a<1000000)
            ans = 4;
        else
            ans = 5;
        cout<<"#"<<test_case<<" "<<ans<<"\n";
	}
	return 0;
}
