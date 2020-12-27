#include<iostream>
using namespace std;
void update(int *a,int *b)
{
    *a=*a+*b;
    *b=*a-*b-*b;
    if(*b<0)
    {
        *b=*b*(-1);
    }
}
int main()
{
    int a,b;
    cin>>a>>b;
    int *pa,*pb;
    pa=&a;
    pb=&b;
    update(pa,pb);
    cout<<*pa<<endl;
    cout<<*pb<<endl;
}