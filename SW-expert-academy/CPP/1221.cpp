#include <iostream>
#include <algorithm>

using namespace std;

int main(){
	int t;
	cin>>t;
	for(int test=1;test<=t;test++){
		vector<pair<int,string>> vec;
		string st;
		int n;
		cin>>st>>n;

		for(int i=0;i<n;i++){
			cin>>st;

		if(st=="ZRO")	vec.push_back({0,"ZRO"});
		if(st=="ONE") vec.push_back({1,"ONE"});
		if(st=="TWO")	vec.push_back({2,"TWO"});
		if(st=="THR")	vec.push_back({3,"THR"});
		if(st=="FOR")	vec.push_back({4,"FOR"});
		if(st=="FIV")	vec.push_back({5,"FIV"});
		if(st=="SIX")	vec.push_back({6,"SIX"});
		if(st=="SVN")	vec.push_back({7,"SVN"});
		if(st=="EGT")	vec.push_back({8,"EGT"});
		if(st=="NIN")	vec.push_back({9,"NIN"});
		}
		sort(vec.begin(),vec.end());
		cout<<"#"<<test<<endl;
		for(int i=0;i<vec.size();i++)
			cout<<vec[i].second<<" ";
	}
}
