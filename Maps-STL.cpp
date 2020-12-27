#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<map>
#include<iterator>
using namespace std;


int main() {
    map<string,int> m;
    int n;
    int c;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        cin>>c;
        char str[1000];
        switch(c)
        {
            fflush(stdin);
            //cin.ignore(numeric_limits<streamsize>::max(),'\n'); 
            case 1:
               cin>>str;
               int num;
               cin>>num;
               fflush(stdin);
               //cout<<num;
               m[str]=m[str]+num;
               m.insert(make_pair(str,num));
               break;
            case 2:
               cin>>str;
               m.erase(str);
               break;
            case 3:
               //char str[1000];
               cin>>str;
               map<string,int> ::iterator itr=m.find(str);
               if(m.end()==itr)
               {
                   cout<<"0"<<endl;
               }
               else
               {
                   cout<<m[str]<<endl;
               }
               break;
        }
        
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
