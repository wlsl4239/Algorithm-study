#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

int n,m;
int arr[100110];
int main(){
    
    scanf("%d%d",&n,&m);
    
    for(int i=1;i<=n;i++)
    {
        int num;
        scanf("%d",&num);
        arr[i] = arr[i-1] + num;
        
    }
    
    while(m--){
        int a,b;
        scanf("%d%d",&a,&b);
        printf("%d\n",arr[b] - arr[a-1]);
        
    }
}

