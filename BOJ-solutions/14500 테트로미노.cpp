#include <iostream>
using namespace std;
bool mask[19][4][4] = {	
		{{true, true, true, false},{true, false, false, false},{false, false, false, false},{false, false, false, false}},
		{{true, false, false, false},{true, false, false, false},{true, true, false, false},{false, false, false, false}},
		{{false, false, true, false},{true, true, true, false},{false, false, false, false},{false, false, false, false}},
		{{true, true, false, false},{false, true, false, false},{false, true, false, false},{false, false, false, false}},	
		{{true, true, true, false},{false, false, true, false},{false, false, false, false},{false, false, false, false}},
		{{true, true, false, false},{true, false, false, false},{true, false, false, false},{false, false, false, false}},
		{{true, false, false, false},{true, true, true, false},{false, false, false, false},{false, false, false, false}},
		{{false, true, false, false},{false, true, false, false},{true, true, false, false},{false, false, false, false}},
		{{true, true, true, false},{false, true, false, false},{false, false, false, false},{false, false, false, false}},
		{{true, false, false, false},{true, true, false, false},{true, false, false, false},{false, false, false, false}},
		{{false, true, false, false},{true, true, true, false},{false, false, false, false},{false, false, false, false}},
		{{false, true, false, false},{true, true, false, false},{false, true, false, false},{false, false, false, false}},
		{{true, false, false, false},{true, true, false, false},{false, true, false, false},{false, false, false, false}},
		{{false, true, true, false},{true, true, false, false},{false, false, false, false},{false, false, false, false}},
		{{false, true, false, false},{true, true, false, false},{true, false, false, false},{false, false, false, false}},
		{{true, true, false, false},{false, true, true, false},{false, false, false, false},{false, false, false, false}},
		{{true, true, false, false},{true, true, false, false},{false, false, false, false},{false, false, false, false}},
		{{true, true, true, true},{false, false, false, false},{false, false, false, false},{false, false, false, false}},
		{{true, false, false, false},{true, false, false, false},{true, false, false, false},{true, false, false, false}}
};
int arr[510][510];

int main(){
	int n ,m;
	cin>>n>>m;

	for(int i=0;i<n;i++)
		for(int j=0;j<m;j++)
			cin>>arr[i][j];

	int ans = 0;

	for(int k=0;k<19;k++) 
		for(int i=0;i<n;i++) 
			for(int j=0;j<m;j++) {
				int sum = 0;
				for(int y=0;y<4;y++) 
					for(int x=0;x<4;x++) 
						if(mask[k][y][x])
							sum+=arr[i+y][j+x];
					
				ans = (ans<sum) ? sum : ans;
            }
    
	cout<<ans<<endl;
}

/*
아래 마스크(19개)에 해당하는 영역을 더해서 최대값과 비교함.

■■■□
■□□□
□□□□
□□□□

■□□□
■□□□
■■□□
□□□□

□□■□
■■■□
□□□□
□□□□

■■□□
□■□□
□■□□
□□□□

■■■□
□□■□
□□□□
□□□□

■■□□
■□□□
■□□□
□□□□

■□□□
■■■□
□□□□
□□□□

□■□□
□■□□
■■□□
□□□□

■■■□
□■□□
□□□□
□□□□

■□□□
■■□□
■□□□
□□□□

□■□□
■■■□
□□□□
□□□□

□■□□
■■□□
□■□□
□□□□

■□□□
■■□□
□■□□
□□□□

□■■□
■■□□
□□□□
□□□□

□■□□
■■□□
■□□□
□□□□

■■□□
□■■□
□□□□
□□□□

■■□□
■■□□
□□□□
□□□□

■■■■
□□□□
□□□□
□□□□

■□□□
■□□□
■□□□
■□□□

*/
