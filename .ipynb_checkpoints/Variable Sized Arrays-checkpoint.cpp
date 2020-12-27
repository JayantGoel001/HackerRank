#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int n;
    int q;
    cin>>n>>q;
    vector<int> x[n];
    int input;
    for(int i=0;i<n;i++)
    {
       cin>>input;
       int c;
       for(int j=0;j<input;j++)
       {
           cin>>c;
           x[i].push_back(c);
       }
    }
    for(int i=0;i<q;i++)
    {
        int n,m;
        cin>>n>>m;
        cout<<x[n][m]<<endl;
    }
}
