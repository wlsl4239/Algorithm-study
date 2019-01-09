#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

vector<long long>card;
int isF;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        card.clear();
        isF = 0;
        long long a;
        cin>>a;
        
        for(int i=0;i<16;i++)
        {
            card.push_back(a%10);
            a/=10;
        }
        
        for(int i=1;i<16;i+=2)
        {
            card[i] *= 2;
            
            if(card[i]>=10)
                card[i] = card[i]%10 + card[i]/10;
        }
        
        for(int i=0;i<16;i++)
            isF+=card[i];
        
        if(isF%10 == 0)
            cout<<"T"<<endl;
        else
            cout<<"F"<<endl;
    }
}
