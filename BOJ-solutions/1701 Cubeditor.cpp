#include <iostream>
#include <vector>
#include <string>
#include <algorithm>


using namespace std;

string a;
char vec[5001][5001];
vector<int> pi;

void getpi(string s){
    pi.clear();
    pi.resize(s.length());
    int j = 0;
    
    for(int i=1;i<s.length();i++)
    {
        while(j>0 && s[i] != s[j])
            j = pi[j-1];
        if(s[i] == s[j])
            pi[i] = ++j;
    }
}

int main()
{
    cin>>a;
    int maxx = 0;
    unsigned long int l = a.size();
    
    for(int i=0;i<a.size();i++)
        vec[0][i] = a[i];
    for(int i=1;i<l;i++)
        for(int j=0; j<l-i; j++)
            vec[i][j] = vec[i-1][j+1];
    
    for(int i=0;i<l;i++)
    {
        getpi(vec[i]);
        for(int j=0;j<pi.size();j++)
            maxx = max(pi[j],maxx);
    }
    
    cout<<maxx<<endl;
    
}
