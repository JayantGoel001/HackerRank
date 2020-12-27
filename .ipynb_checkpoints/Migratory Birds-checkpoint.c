#include<stdio.h>
int main()
{
    int n,x;
    scanf("%d",&n);
    int ar[n];
    int br[n],cr[n];
    int i,j,temp;
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    for(i=1;i<=5;i++)
    {
        x=0;
        for(j=0;j<n;j++)
        {
            if(ar[j]==i)
            {
                x++;
            }
        }
        br[i-1]=i;
        cr[i-1]=x;

    }
    int large=0;
    int pos;
    for(i=0;i<5;i++)
    {
        if(large<cr[i])
        {
            large=cr[i];
            pos=i;
        }
    }
    printf("%d",br[pos]);
}