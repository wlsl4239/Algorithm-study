#include <iostream>
#include <cstdio>
#include <algorithm>
#include <queue>
#include <vector>
#include <stack>
#include <sstream>
#include <list>
#include <cmath>
#include <string.h>
#include <cstring>
using namespace std;

int arr[30];

int main()
{
    ios::sync_with_stdio(false);
    memset(arr,-1,sizeof(arr));
    string s;
    
    cin>>s;
    
    for(int i=0;i<s.size();i++)
        if(arr[s[i] - 'a'] == -1)
            arr[s[i] - 'a'] = i;
    for(int i=0;i<26;i++)
     cout<<arr[i]<<" ";
}



