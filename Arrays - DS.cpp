#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,i,temp;
    scanf("%d",&n);
    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    for(i=0;i<n/2;i++)
    {
        temp=ar[n-i-1];
        ar[n-i-1]=ar[i];
        ar[i]=temp;
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",ar[i]);
    }
    return 0;
}