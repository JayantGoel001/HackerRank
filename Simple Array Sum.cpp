#include<stdio.h>
#include<stdlib.h>
int simpleArraySum(int);
int main()
{
    int i,a,sum;
    sum=0;
    scanf("%d",&a);
    int ar[a];
    for(i=0;i<a;i++)
    {
        scanf("%d",&ar[i]);
    }
    for(i=0;i<a;i++)
    {
        sum=sum+ar[i];
    }
    printf("%d",sum);
}