//#447-A-2

#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

string str;
int arr[26];

int main()
{
#ifdef _CONSOLE
    freopen("Text.txt","r",stdin);
#endif

    cin>>str;

    int a;
    cin>>a;

    for(int i=0;i<26;i++)
    {
        cin>>arr[i];
    }

    int sum = 0;

    for(int i=0;i<str.length();i++)
    {
        sum += (i+1) * (arr[(int)(str[i] - 'a')]);
    }
    sort(arr,arr+26);
    for(int i=str.length() + 1;i<str.length() + a + 1;i++)
    {
        sum += i * arr[25];
    }
    cout<<sum<<endl;
}
