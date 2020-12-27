#include<stdio.h>
int main()
{
    int i,j,sum;
    sum=0;
    int ar[6][6];
    for(i=0;i<6;i++)
    {
        for(j=0;j<6;j++)
        {
            scanf("%d",&ar[i][j]);
        }
    }
    int max=0;
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            sum=ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+
            ar[i+2][j+1]+ar[i+2][j+2];
            if(i==0&&j==0)
            {
                max=sum;
            }
            if(sum>=max)
            {
                max=sum;
            }
            
        }
        
    }
    printf("%d",max);
}