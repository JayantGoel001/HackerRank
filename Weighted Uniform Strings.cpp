#include <iostream>
#include <map>
#include <set>
using namespace std;
int main(){
    string str;
    cin>>str;
    set<int> s;
    int len = str.length();
    map<char,int> character;
    for (int i = 0; i < 26; ++i) {
        character.insert(make_pair(i+97,i+1));
    }
    char prev = ' ';
    int mul = 1;
    for (int i = 0; i < len; ++i) {
        if (i>0 && prev==str[i]){
            mul++;
        } else{
            mul=1;
        }
        s.insert(mul*character[str[i]]);
        prev = str[i];
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