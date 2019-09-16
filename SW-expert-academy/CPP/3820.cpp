#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct rail {
    long long a;
    long long b;
}typedef rail;

vector<rail> arr;

bool cmp(rail a, rail b){
    if (b.b*(a.a - 1) > a.b*(b.a - 1))
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
