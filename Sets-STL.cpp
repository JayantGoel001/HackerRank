#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    set<int> s;
    int n;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        int ch;
        cin>>ch;
    int x;
    cin>>x;
    switch(ch)
    {
        case 1:  
            s.insert(x);
            break;
        case 2:
            s.erase(x);
            break;
        case 3:
            set<int> ::iterator itr;
            itr=s.find(x);
            if(itr==s.end())
            {
                cout<<"No"<<endl;
                break;
            }
            cout<<"Yes"<<endl;
            break;
    }
    }  
    return 0;
}



