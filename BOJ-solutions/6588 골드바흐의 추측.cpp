#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>

using namespace std;

#define NUM 1000010

bool era[NUM];

int n;

int main(){
    era[0] = true;
    era[1] = true;
    for(int i=2;i<NUM;i++)
        if(!era[i])
            for(int j=i+i;j<NUM;j+=i)
                era[j] = true;
    
    while(1)
    {
        int a;
        scanf("%d",&a);
        if(a==0)
            return 0;
        for(int i=2;i<=a/2;i++)
        {
            if(!era[i]){
                if(!era[a-i])
                {
                    printf("%d = %d + %d\n",a,i,a-i);
                    break;
                }
            }
        }
        
    }
}
