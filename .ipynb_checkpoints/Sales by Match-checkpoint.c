#include<stdio.h>
int main()
{
    int n,i,j,count,c;
    scanf("%d",&n);
    int ar[n];
    c=0;
    count=0;
    int fre[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(ar[i]==ar[j])
            {
                count++;
                fre[j]=0;
            }
        }
        fre[i]=count;
         count=0;
    }
    for(i=0;i<n;i++)
    {
        c=c+fre[i]/2;
    }
    printf("%d",c);
}