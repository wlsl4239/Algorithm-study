#include<stdio.h>
#include<algorithm>

using namespace std;

/*
bool BinarySearch(int start,int end, int target)
{
	while(1)
	{
		if(start>end)
			return false;
		int mid = (start + end) / 2;

		if(arr[mid] < target)
			start = mid+1;
		else if(arr[mid]>target)
			end = mid-1;
		else if(arr[mid]==target)
			return true;
	}
}
	*/
int main()
{
	int n;
	int m;
	int target;
	int arrn[100000];

	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arrn[i]);
	}

	sort(arrn,arrn+n);
	scanf("%d",&m);
	for(int j=0;j<m;j++)
	{
		scanf("%d",&target);
		if(binary_search(arrn,arrn+n,target)==1)
		{
			printf("1\n");
		}
		else
			printf("0\n");
		
	}


}
