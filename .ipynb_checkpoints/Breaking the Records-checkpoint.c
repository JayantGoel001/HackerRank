#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int ar[n];
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    int small,large;
    small=ar[0];
    large=ar[0];
    int c,c1;
    c=0;
    c1=0;
    for(i=0;i<n;i++)
    {
       if(ar[i]>large)
       {
           c++;
           large=ar[i];
       }
       else if(ar[i]<small)
       {
           c1++;
           small=ar[i];
       }
    }
    printf("%d %d",c,c1);
}