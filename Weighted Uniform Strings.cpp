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
    map<char,int> character;
    for (int i = 0; i < 26; ++i) {
        character.insert(make_pair(i+97,i+1));
    }
    for (int i = 0; i < len; ++i) {
        if (mp.count(str[i])==0){
            mp[str[i]] = 1;
        } else{
            mp[str[i]]+=1;
        }
    }
    for(auto & it : mp){
        for(int i=1;i<=it.second;i++){
            s.insert(i*character[it.first]);
        }
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