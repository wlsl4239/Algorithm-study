#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>
#include <vector>
#include <queue>
using namespace std;

vector<vector<string>> vec;
vector<pair<int,string>> ans;
bool isOk[20000];
int n;

int main(){
    cin>>n;
    vec.resize(n+1);
    
    for(int i=0;i<n;i++)
    {
        int a;
        cin>>a;
        for(int j=0;j<a;j++)
        {
            string s;
            cin>>s;
            vec[i].push_back(s);
        }
    }
    
    sort(vec.begin(),vec.end());
    
    
    for(int i=1;i<=n;i++)
    {
        for(int j=0;j<vec[i].size();j++)
        {
            ans.push_back(make_pair(j, vec[i][j]));
        }
    }
    for(int i=0;i<ans.size();i++)
        isOk[i] = true;
    
    for(int i=0;i<ans.size();i++)
    {
        for(int j=i+1;j<ans.size();j++)
        {
            if(ans[i].first>ans[j].first && isOk[j])
                break;
            
            if(ans[i].first == ans[j].first && ans[i].second == ans[j].second)
                isOk[j] = false;
        }
    }
    for(int i=0;i<ans.size();i++)
    {
        if(isOk[i])
        {
            for(int j=0;j<ans[i].first;j++)
                cout<<"--";
            cout<<ans[i].second<<endl;
        }
    }
    
}
