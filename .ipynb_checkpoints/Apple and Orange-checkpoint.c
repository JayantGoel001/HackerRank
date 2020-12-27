#include<stdio.h>
#include<stdlib.h>
int main()
{
    int s,t,a,b,m,n;
    int c,d;
    c=0;
    d=0;
    scanf("%d  %d",&s,&t);
    scanf("%d  %d",&a,&b);
    scanf("%d  %d",&m,&n);
    int ar[m];
    int br[n];
    for(int i=0;i<m;i++)
    {
        scanf("%d  ",&ar[i]);
    }
    for(int i=0;i<n;i++)
    {
        scanf("%d  ",&br[i]);
    }
    for(int i=0;i<m;i++)
    {
        ar[i]=ar[i]+a;
        if((ar[i]>=s)&&(ar[i]<=t))
        {
            c++;
        }
    }
    for(int i=0;i<n;i++)
    {
        br[i]=br[i]+b;
        if((br[i]>=s)&&(br[i]<=t))
        {
            d++;
        }
    }
    printf("%d\n",c);
    printf("%d",d);
    return 0;
}