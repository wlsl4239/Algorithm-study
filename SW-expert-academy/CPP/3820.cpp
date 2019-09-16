#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
 (ai-1) / bi 로 정렬한 배치가 정답 배치이다.
 */


struct rail {
    long long a;
    long long b;
}typedef rail;

vector<rail> arr;

bool cmp(rail i, rail j){
    if (j.b*(i.a - 1) >= i.b*(j.a - 1))
        return true;
    return false;
}

int main() {
    int T;
    cin >> T;
    for (int tc = 1; tc <= T; tc++)
    {
        arr.clear();
        unsigned long long  int ans = 1;
        int N;
        cin >> N;
        for (int i = 0; i < N; i++)
        {
            rail temp;
            cin >> temp.a >> temp.b;
            arr.push_back(temp);
        }
        sort(arr.begin(), arr.end(), cmp);
        
        for (int i = 0; i < arr.size(); i++)
            ans = ((arr[i].a * ans) % 1000000007 + arr[i].b) % 1000000007;
        cout << "#" << tc << " " << ans << endl;
        
    }
    return 0;
}
