#include <iostream>
#include <map>
#include <vector>
using namespace std;
int main(){
    int n;
    cin>>n;
    string str;
    cin>>str;
    map<char,int> m;
    for (int i = 0; i < n; ++i) {
        if(m.count(str[i])==0){
            m[str[i]] = 1;
        } else{
            m[str[i]] +=1;
        }
    }
    vector<string> v;
    for(auto it=m.begin();it!=m.end();it++){
        for(auto it2=it;it2!=m.end();it2++){
            if (it!=it2 && abs(it->second - it2->second)<=1){
                string s = "";
                int k=0;
                char lastChar = ' ';
                for (int i = 0; i < n; ++i) {
                    if (str[i]==lastChar){
                        k = 1;
                        break;
                    }
                    if (str[i]==it->first || str[i]==it2->first){
                        s+=str[i];
                        lastChar = str[i];
                    }
                }
                if (k==0){
                    v.push_back(s);
                }
            }
        }
    }
    int maxi = 0;
    for(auto & it : v){
        if (it.length() >maxi){
            maxi = it.length();
        }
    }
    cout<<maxi<<"\n";
}