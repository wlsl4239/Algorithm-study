#include <iostream>
#include <algorithm>
#include <string.h>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
#include <deque>

using namespace std;

deque<int> deq;
int main(){
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        
        cin>>s;
        
        if(s=="push_front"){
            int a;
            cin>>a;
            deq.push_front(a);
        }
        
        else if(s=="push_back"){
            int a;
            cin>>a;
            deq.push_back(a);
        
        }
        else if(s=="pop_front"){
            if(deq.empty())
                cout<<"-1"<<endl;
            else{
                cout<<deq.front()<<endl;
                deq.pop_front();
            }
        }
        else if(s=="pop_back"){
            if(deq.empty())
                cout<<"-1"<<endl;
            else{
                cout<<deq.back()<<endl;
                deq.pop_back();
            }
        
        }
        else if(s=="size"){
            cout<<deq.size()<<endl;
        
        }
        else if(s=="empty"){
            cout<<(int)deq.empty()<<endl;
        
        }
        else if(s=="front"){
            
            if(deq.empty())
                cout<<"-1"<<endl;
            else
                cout<<deq.front()<<endl;
        }
        else if(s=="back"){
            if(deq.empty())
                
                cout<<"-1"<<endl;
            else
                cout<<deq.back()<<endl;
        
        }
        
    }
}
