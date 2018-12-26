#include <iostream>
#include <string>


using namespace std;

int main() {

    string st1;
    
    cin>>st1;
    
    while(1)
    {
        if(st1.size()>10)
        {
            for(int i=0;i<10;i++)
                cout<<st1[i];
            cout<<endl;
            st1.erase(0,10);
        }
        else
        {
        cout<<st1<<endl;
            break;
        }
    }
    return 0;
}
