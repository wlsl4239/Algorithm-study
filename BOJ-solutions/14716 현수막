#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <cmath>

using namespace std;

int m, n;
int arr[500][500];
int ans;
int x[8] = { 1,	1,	1,	0,	-1,	-1,	-1,	0 };
int y[8] = { 1,	0,	-1,	-1,	-1,	0,	1,	1 };

void func(int xx, int yy){
    arr[xx][yy] = 0;
    for (int i = 0;i < 8;i++){
        if(xx+x[i]<0 || yy+y[i]<0)
            continue;
        if (arr[xx + x[i]][yy + y[i]] == 1)
            func(xx + x[i], yy + y[i]);

    }
}

int main(){
    cin >> m >> n;
    for (int i = 0;i < m;i++)
        for (int j = 0;j < n;j++)
            cin >> arr[i][j];
    for (int i = 0;i < m;i++)
        for (int j = 0;j < n;j++)
            if (arr[i][j] == 1){
                ans++;
                func(i, j);
            }
    cout << ans << endl;
}
