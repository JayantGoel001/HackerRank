#include<stdio.h>
int main ()
{
    int n,i,j,a,b,c;
    scanf("%d",&n);
    int k;
    for(i=0;i<n;i++)
    {
        k=n;
            for(b=0;b<i;b++)
            {
                printf("%d ",k);
                k--;
            }
           for(a=1;a<2*n-(2)*i;a++)
           {
               printf("%d ",k);
           }
           for(c=0;c<i;c++)
           {
               k++;
               printf("%d ",k);
           }
        printf("\n");
    }
    for(i=n-2;i>=0;i--)
    {
        k=n;
        for(b=0;b<i;b++)
        {
            printf("%d ",k);
            k--;
        }
        for(a=1;a<2*n-2*i;a++)
        {
            printf("%d ",k);
        }
        for(c=0;c<i;c++)
        {
            k++;
            printf("%d ",k);
        }
        printf("\n");
    }
}