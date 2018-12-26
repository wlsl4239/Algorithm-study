#include <iostream>
#include <algorithm>
#include <string.h>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>

using namespace std;

string s;
int arr[100];
int n;
int main(){
    cin>>n;
    while(n--)
    {
        memset(arr,0,sizeof(arr));
        int score = 0;
        cin>>s;
        if(s[0] == 'O')
            arr[0] = 1;
        for(int i=1;i<s.size();i++)
        {
            if(s[i] == 'O' && s[i-1] == 'O')
                arr[i] = arr[i-1] +1;
            else if(s[i] == 'O')
                arr[i] = 1;
        }
        
        for(int i=0;i<s.size();i++)
            score += arr[i];
        cout<<score<<endl;
    }
}
