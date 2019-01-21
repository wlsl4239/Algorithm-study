//JAVA, C++로는 시간초과,메모리초과뜨고 c로해야 풀리는 개같은문제.

#include <iostream>
#include <stack>

using namespace std;

stack<pair<int, int>> st;

int main() {
	ios::sync_with_stdio(false);
	int n;
	int num;
	scanf("%d", &n);
	for (int i = 1;i <= n;i++) {
		scanf("%d", &num);
		while (!st.empty() && num > st.top().first) 
			st.pop();
		
		if (st.empty())
			printf("0 ");
		else
			printf("%d ",st.top().second);

		st.push({ num,i });
	}
}
