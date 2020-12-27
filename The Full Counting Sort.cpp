#include<iostream>
#include<string.h>
#include <vector>
using namespace std;
int main()
{
    int n;
    cin>>n;
    vector<string> ar[n];
    for(int i=0;i<n;i++)
    {
        int index;
        string str;
        cin>>index>>str;
        if(i<n/2)
        {
            ar[index].push_back("-");
        }
        else  
        {
            ar[index].push_back(str);
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<ar[i].size();j++)
        {
            cout<<ar[i][j]<<" ";
        }
    }
}
