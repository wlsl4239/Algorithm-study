#include <iostream>
#include <string>
#include <stack>


using namespace std;

int main()
{
    int t;
    cin >> t;
    getchar();
    while (t--) {
        string s;
        
        getline(cin,s);
        
        if(s[0]<='z' && s[0]>='a')
            s[0] -= 'a' - 'A';
        
        cout << s << endl;
    }
    
}
