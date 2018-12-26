#include <iostream>
#include <algorithm>
using namespace std;

int arr[105];
int brr[105];
int n;
int sum1;

int main()
{
	cin >> n;
	for (int i = 0;i<n;i++)
		cin >> arr[i];
	for (int i = 0;i<n;i++)
		cin >> brr[i];


	sort(arr, arr + n);
	sort(brr, brr + n);

	for (int i = 0;i<n;i++)
	{
		sum1 = sum1 + (arr[i] * brr[n - i - 1]);
	}


	cout << sum1 << endl;
}
