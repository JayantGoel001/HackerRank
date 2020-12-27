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
        n;
       cin>>n;
       vector<int> ::iterator low1;
       for(int i=0;i<n;i++)
       {
           int x;
           cin>>x;
           int l=-1;
           int start=0;
           int end=v.size();
           while(start<=end)
           {
               int middle=(start+end)/2;
               if(x==v.at(middle))
               {
                   l=1;
                   break;
               }
               else if(x>v.at(middle))
               {
                   start=middle+1;
               }
               else  
               {
                   end=middle-1;
               }
           }
           if(l==-1)
           {
               low1=lower_bound(v.begin(),v.end(),x);
               cout<<"No "<<(low1-v.begin()+1)<<endl;
           }
           else if (l==1)
           {
               low1=lower_bound(v.begin(),v.end(),x);
               cout<<"Yes "<<(low1-v.begin()+1)<<endl;
           }
       }
    return 0;
}
