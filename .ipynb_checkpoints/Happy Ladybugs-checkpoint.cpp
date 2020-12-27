#include <iostream>
#include <map>
#include <string>
#include <set>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        string str;
        cin>>str;
        map<char,int> m;
        set<char> s;
        for(int j=0;j<n;j++){
            if(m.count(str[j])==0){
                m.insert(make_pair(str[j],1));
            }else if (m.count(str[j])!=0) {
                m[str[j]]+=1;
            }
        }
        bool found = true;
        for(auto it:m){
            if(it.first!='_' && it.second==1){
                found=false;
                cout<<"NO\n";
                break;
            }
        }
        if(found){
            if(m['_']==0){
                for(int j=1;j<n-1;j++){
                    if(str[j]!=str[j-1] && str[j]!=str[j+1]){
                        cout<<"NO\n";
                        found=false;
                        break;
                    }
                }
            }
        }
        if (found) {
            cout<<"YES\n";
        }
    }
}