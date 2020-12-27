#include<stdio.h>
//#include<stdlib.h>
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
    //printf("%d",n);
    /*for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(ar[j]>ar[j+1])
            {
            temp=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=temp;
            }
        }
    }*/
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
   /* for(i=0;i<5;i++)
    {
        printf("%d=%d\n",br[i],cr[i]);
    }*/
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
