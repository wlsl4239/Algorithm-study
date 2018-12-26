#include <iostream>
#include <vector>
#include <string>
#include <algorithm>


using namespace std;

string a,b;
vector<int> pi;
vector<unsigned long int> ans;

void getpi(){
    pi.resize(b.length());
    int j = 0;
    
    for(int i=1;i<b.length();i++)
    {
        while(j>0 && b[i] != b[j])
            j = pi[j-1];
        if(b[i] == b[j])
            pi[i] = ++j;
    }
}


void kmp(){
    int j = 0;
    
    for(int i=0;i<a.length();i++)
    {
        while(j>0 && a[i] != b[j])
            j = pi[j-1];
        if(a[i] == b[j])
        {
            if(j == b.length()-1)
            {
                ans.push_back(i-b.length()+1);
                j = pi[j];
            }
            else
                j++;
        }
    }
}
int main()
{
    getline(cin,a);
    getline(cin,b);
    
    getpi();
    kmp();
    
    cout<<ans.size()<<endl;
    
    for(int i=0;i<ans.size();i++)
        cout<<ans[i]+1<<" ";
    cout<<"\n";
}
