#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<string> parseInts(string str) {
	vector<string> v;
    int prev = 0;
    for(int i=0;i<str.length();i++){
        if(str[i]==','){
            v.push_back(str.substr(prev,i-prev));
            prev = i+1;
        }
    }
    v.push_back(str.substr(prev));
    return v;
}

int main() {
    string str;
    cin >> str;
    vector<string> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}