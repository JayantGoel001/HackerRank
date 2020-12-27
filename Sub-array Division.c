#include<stdio.h>
int main()
{
    int n,i,j,dd,mm;
    scanf("%d",&n);
    int ar[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    scanf("%d %d",&dd,&mm);
    int sum=0;
    int c=0;
    for(i=0;i<n-mm+1;i++)
    {
        sum=0;
        for(j=i;j<mm+i;j++)
        {
            sum+=ar[j];
        }
        if(sum==dd)
        {
            c++;
        }
    }
    if(c!=0)
        printf("%d",c);
    else 
    {
        if(sum==dd&&n==mm)
        {
            c=1;
            printf("%d",c);
        }
        else
        {
            printf("%d",c);
        }
    }
}
