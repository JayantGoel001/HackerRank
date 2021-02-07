#include <iostream>
#include <map>
#include <set>
using namespace std;
int main(){
    string str;
    cin>>str;
    set<int> s;
    map<char,int> mp;
    int len = str.length();
    for (int i = 0; i < len; ++i) {
        if (mp.count(str[i])==0){
            mp[str[i]] = 1;
        } else{
            mp[str[i]]+=1;
        }
    }
    int k=1;
    for (int i = 0; i < len; ) {
        for (int j = 1; j <= mp[str[i]]; ++j) {
            s.insert(k*j);
        }
        i+=mp[str[i]];
        k++;
    }
    int n;
    cin>>n;
    for (int i = 0; i < n; ++i) {
        int x;
        cin>>x;
        if (s.count(x) == 0){
            cout<<"No\n";
        } else{
            cout<<"Yes\n";
        }
    }
}