#include <iostream>
#include <map>
using namespace std;
int main(){
    string str;
    cin>>str;
    map<int,bool> m;
    int len = str.length();
    int k=1;
    int lastI;
    for (int i = 0; i < len; ++i) {
        if (i>=1){
            lastI = i+1;
            while (str[i]==str[i-1]){
                m[lastI*k] = true;
                k+=1;
                i+=1;
            }
            if (str[i]!=str[i-1]){
                k=1;
                m[i+1]= true;
            }
        } else{
            m[i+1] = true;
        }
    }
    int n;
    cin>>n;
    for (int i = 0; i < n; ++i) {
        int x;
        cin>>x;
        if (m.count(x)==0){
            cout<<"No\n";
        } else{
            cout<<"Yes\n";
        }
    }
}