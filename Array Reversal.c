#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d",&n);
    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[n-i-1]);
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",ar[i]);
    }
}
