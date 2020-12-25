#include<stdio.h>
int main()
{
    int n,k;
    scanf("%d %d",&n,&k);
    int ar[n];
    int i,j;
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    int c=0,sum;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            sum=ar[i]+ar[j];
            if(sum%k==0)
            {
                c++;
            }
        }
    }
    printf("%d",c);
}
