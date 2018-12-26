#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;

int main()
{
    int N;
    int M;
    int tree[1000010];
    cin>>N>>M;
    
    for(int i=0;i<N;i++)
        cin>>tree[i];
    
    int minn = 0;
    int maxx = 1000000000;
    
    while(minn+1 < maxx)
    {
        int midd = (minn + maxx) / 2;
        
        
        long long sum = 0;
        
        for(int i=0;i<N;i++)
        {
            if(tree[i] > midd)
                sum += (tree[i] - midd);
        }
        
        
        if(sum >= M)
            minn = midd;
        else
            maxx = midd;
    }
    
    cout<<minn<<endl;
    
}
