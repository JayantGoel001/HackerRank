#include<stdio.h>
#include<string.h>
int main()
{
    int n,i,j,c=0,up=0;
    scanf("%d",&n);
    char s[n];
    scanf("%s",s);
    for(i=0;i<n;i++)
    {
        if(s[i]=='U')
        {
            c++;
        }
        else
        {
            c--;
        }
        if(c<0)
        {
            j=1;
        }
        else if(c==0&&j==1)
        {
            up++;
            j=0;
        }
    }
    printf("%d",up);
}