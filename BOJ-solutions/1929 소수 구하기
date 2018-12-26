#include <iostream>

using namespace std;

#define NUM 1000010

bool era[NUM];

int n,m;

int minp = 1e9;
int sum = -1;

int main(){
    era[1] = true;
    for(int i=2;i<NUM;i++)
        if(!era[i])
            for(int j=i+i;j<NUM;j+=i)
                era[j] = true;
    
    scanf("%d%d",&n,&m);
    
    for(int i=n;i<=m;i++)
    {
        if(!era[i])
        {
            printf("%d\n",i);
        }
    }
    
}
