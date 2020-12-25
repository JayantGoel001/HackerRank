#include <iostream>
#include<stack>
using namespace std;
int main() {
    int i,na,nb,nc,ma=0,mb=0,mc=0;
    stack<int> a,b,c,sa,sb,sc;
    cin>>na>>nb>>nc;
    for(i=0;i<na;i++){
        int x;
        cin>>x;
        a.push(x);
        ma+=x;
        
    }
    while(!a.empty()){
        sa.push(a.top());
        a.pop();
    }
    for(i=0;i<nb;i++){
        int x;
        cin>>x;
        b.push(x);
        mb+=x;
    }
     while(!b.empty()){
        sb.push(b.top());
        b.pop();
    }
    for(i=0;i<nc;i++){
        int x;
        cin>>x;
        c.push(x);
        mc+=x;
    }
      while(!c.empty()){
        sc.push(c.top());
        c.pop();
    }
    while ( ma != mb || mb != mc  ){
        if(ma>=mb && ma>=mc){
             ma-=sa.top();
             sa.pop();
        }
        else if(mb>=ma && mb>=mc){
            mb-=sb.top();
            sb.pop();
        }
        else{
            mc-=sc.top();
            sc.pop();
        }
    }
    
    cout<<ma;
    return 0;
}
