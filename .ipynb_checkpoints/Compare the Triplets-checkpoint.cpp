#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a[3],i,sum1,sum2;
    int b[3];
    sum1=0;sum2=0;
    scanf("%d%d%d",&a[0],&a[1],&a[2],"\n");
    scanf("%d%d%d",&b[0],&b[1],&b[2]);
    for(i=0;i<3;i++)
    {
        if(a[i]>b[i])
        {
            sum1++;
        }
        else if(b[i]>a[i])
        {
            sum2++;
        }
        else
        {
            sum1=sum1+0;
            sum2=sum2+0;
        }
    }
    printf("%d %d",sum1,sum2);
}