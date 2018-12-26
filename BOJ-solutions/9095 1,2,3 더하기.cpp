#include <stdio.h>

int func(int i)
{
	if(i==1)
		return 1;
	if(i==2)
		return 2;
	if(i==3)
		return 4;
	return func(i-1)+func(i-2)+func(i-3);
}
int main()
{
	int t;
	int k;
	scanf("%d",&t);
	for(int i=0;i<t;i++)
	{
		scanf("%d",&k);
		int p = func(k);
		printf("%d\n",p);
	}
	return 0;
}
