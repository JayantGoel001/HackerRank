#include<iostream>
#include<string>
using namespace std;
int main()
{
    string str1,str2;
    cin>>str1>>str2;
    int a=str1.size();
    int b=str2.size();
    cout<<a<<" "<<b<<endl;
    cout<<str1<<str2<<endl;
    char ar1[a];
    char ar2[b];
    for(int i=0;i<a;i++)
    {
        ar1[i]=str1[i];
    }
    for(int i=0;i<b;i++)
    {
        ar2[i]=str2[i];
    }
    char temp;
    temp=ar1[0];
    ar1[0]=ar2[0];
    ar2[0]=temp;
    for (int i = 0; i < a; i++) {
      cout << ar1[i];
    }
    cout << " ";
    for(int i=0;i<b;i++)
    {
        cout<<ar2[i];
    }
}
