#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector<int> v;
    int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    int pos;
    cin>>pos;
    v.erase(v.begin()+pos-1);
    int pos1,pos2;
    cin>>pos1>>pos2;
    v.erase(v.begin()+pos1-1,v.begin()+pos2-1);
    cout<<v.size()<<"\n";
    for(auto i=v.begin();i!=v.end();i++)
    {
        cout<<*i<<" ";
    }
    return 0;
}
