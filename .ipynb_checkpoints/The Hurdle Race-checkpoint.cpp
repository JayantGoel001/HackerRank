#include<iostream>
using namespace std;
int main()
{
    int n,k;
    cin>>n>>k;
    int ar[n];
    int max=0;
    for(int i=0;i<n;i++)
    {
        cin>>ar[i];
        if(max<ar[i])
        {
            max=ar[i];
        }
    }
    int x=max-k;
    if(x<0)
    {
        cout<<"0";
    }
    else
    {
        cout<<x;
    }
}
