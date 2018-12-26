#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <cmath>
#include <string.h>
#include <string>
#include <stack>

using namespace std;

string str1;
string str2;

char strr1[1010];
char strr2[1010];
int dy[1010][1010];


int main()
{
    str1+="";
    str2+="";
    
    
    scanf("%s",strr1);
    scanf("%s",strr2);
    
    str1+=strr1;
    str2+=strr2;
    
    int m = (int)strlen(strr1);
    int n = (int)strlen(strr2);
    
    for(int i=0;i<m;i++)
        dy[i][0] = 0;
    for(int i=0;i<n;i++)
        dy[0][i] = 0;
    
    for (int i = 1 ; i <= m ; i ++)
    {
        for (int j = 1 ; j <= n ; j ++)
        {
            
            if (str1[i-1] == str2[j-1])
                dy[i][j] = dy[i-1][j-1] + 1;
            else if(dy[i-1][j] >= dy[i][j-1])
                dy[i][j] = dy[i-1][j];
            else
                dy[i][j] = dy[i][j-1];
        }
    }
    
    printf("%d \n",dy[m][n]);
    
    return 0;
}



