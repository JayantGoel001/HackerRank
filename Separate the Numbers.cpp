#include <iostream>
#include <vector>
using namespace std;
int main(){
    int n;
    cin>>n;
    for (int i = 0; i < n; ++i) {
        string str;
        cin>>str;
        bool finalOutput = false;
        int len = str.length();
        for (int j = 1; j <= len/2; ++j) {
            vector<string> v;
            for (int k = 0; k < len; k+=j) {
                string s = str.substr(k,j);
                if (s.length()!=j){
                    v[v.size()-1] = v[v.size()-1].append(s);
                } else {
                    v.push_back(s);
                }
            }
            int k = 0;
            bool notFound = false;
            for(auto & it : v){
                if (stoi(it) - stoi(v[0]) != k){
                    notFound = true;
                    break;
                }
                k++;
            }
            if (!notFound){
                finalOutput = true;
                cout<<"Yes "<<v[0]<<"\n";
                break;
            }
        }
        if (!finalOutput){
            cout<<"NO\n";
        }
    }
}