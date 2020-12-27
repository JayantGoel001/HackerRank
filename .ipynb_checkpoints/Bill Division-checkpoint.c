#include<stdio.h>
int main()
{
    int n,k,i,sum=0;
    scanf("%d%d",&n,&k);
    int bill[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&bill[i]);
    }
    int b;
    scanf("%d",&b);
    for(i=0;i<n;i++)
    {
        if(i==k)
        {
            continue;
        }
        sum+=bill[i];
    }
    int x=b-sum/2;
    if(x!=0)
    {
        printf("%d",x);
    }
    else
    {
        printf("Bon Appetit");
    }
}
