#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
#include <queue>
#include <cmath>

using namespace std;

int arr1[102];
char arr2[102];

int nowbomb;
int quest;
int main()
{
    cin>>nowbomb>>quest;
    
    int bomb = 210;
    
    
    for(int i=0;i<quest;i++)
        cin>>arr1[i]>>arr2[i];
    
    
    for(int i=0;i<quest;i++)
    {
        if(arr2[i] == 'T')
        {
            bomb -= arr1[i];
            if(bomb <= 0)
                break;
            nowbomb++;
            nowbomb%=9;
            if(nowbomb==0)
                nowbomb++;
            
        }
        else
            bomb -= arr1[i];
    }
    
    cout<<nowbomb<<"\n";
    
    
    
}
