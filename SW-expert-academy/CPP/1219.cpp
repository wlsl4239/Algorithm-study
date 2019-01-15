#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int ans;
vector<int> map[100];
int T,len;

void dfs(int now) {
	if(now == 99) {
		ans = 1;
		return;
	}
	if(map[now].empty())
		return;

for(int i=0;i<map[now].size();i++) 
		dfs(map[now][i]);
}        

int main(){
	for(int test_case = 1; test_case <= 10; test_case++)
	{
    ans = 0;
    int len;
		cin>>T>>len;
		
		for(int i=0;i<len;i++) {
			int a,b;
      cin>>a>>b;
			map[a].push_back(b);
		}
    
		dfs(0);
    
		cout<<"#"<<test_case<<" "<<ans<<endl;	
        for(int i=0;i<100;i++)
           map[i].clear();
    }
}
