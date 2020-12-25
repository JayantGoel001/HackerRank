#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int n;
    long n2;
    char ch;
    float f1;
    double d2;
    cin>>n;
    cin>>n2>>ch>>f1>>d2;
    cout<<n<<endl;
    cout<<n2<<endl;
    cout<<ch<<endl;
    cout<<fixed<<setprecision(3)<<f1<<endl;
    cout<<fixed<<setprecision(9)<<d2<<endl;
}
