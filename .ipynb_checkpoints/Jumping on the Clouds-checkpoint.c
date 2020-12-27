#include<stdio.h>

int main()
{
    int n,i;
    int c=0;
    scanf("%d",&n);
    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    for(i=0;i<n;i++)
    {
        if(ar[i]==0)
        {
            c++;
        }
    }
    for(i=0;i<n-2;i++)
    {
        if(ar[i+2]==0&&ar[i+1]==0&&ar[i]==0)
        {
            c--;
            i++;
        }
    }
    printf("%d",c-1);
}