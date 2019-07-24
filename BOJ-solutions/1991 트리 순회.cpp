#include <iostream>
using namespace std;

int tree[27][2];

void preorder(int now) {
	if (now == -1) return;
	cout<<(char)(now + 'A');
	preorder(tree[now][0]);
	preorder(tree[now][1]);
}

void inorder(int now) {
	if (now == -1) return;
	inorder(tree[now][0]);
	cout << (char)(now + 'A');
	inorder(tree[now][1]);

}
void postorder(int now) {
	if (now == -1) return;
	postorder(tree[now][0]);
	postorder(tree[now][1]);
	cout << (char)(now + 'A');

}

int main() {
	ios::sync_with_stdio(false);
	int n;
	cin >> n;
	for (int i = 0; i < 26; i++) {
		tree[i][0] = -1;
		tree[i][1] = -1;
	}
	for (int i = 0; i < n; i++) {
		char nn;
		char ll;
		char rr;
		cin >> nn >> ll >> rr;
		
		if (ll != '.')
			tree[nn - 'A'][0] = ll - 'A';
		if (rr != '.')
			tree[nn - 'A'][1] = rr - 'A';
	}
	preorder(0); cout << "\n";
	inorder(0); cout << "\n";
	postorder(0); cout << "\n";


}
