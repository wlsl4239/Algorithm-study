//851-C

#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
#include <cmath>
#include <tuple>
#define N 1020

using namespace std;

const double PI = acos(-1);
int point[N][5];
int ans[N], cnt;


int main() {
    cin.sync_with_stdio(false);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
        cin >> point[i][0] >> point[i][1] >> point[i][2] >> point[i][3] >> point[i][4];
    
    cnt = 0;
    bool flag;
    
    for (int i = 0; i < n; i++) {
        flag = true;
        
        for (int j = 0; j < n && flag; j++) {
            if (i == j)
                continue;
            
            for (int k = 0; k < n&&flag; k++) {
                if (k == i || k == j)
                    continue;
                double a = 0, b = 0, c = 0;
                for (int t = 0; t < 5; t++) {
                    b += (point[i][t] - point[j][t])*(point[i][t] - point[j][t]);
                    c += (point[i][t] - point[k][t])*(p
