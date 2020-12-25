#include<stdio.h>
int main()
{
    int i,n,p,c;
    c=0;
    scanf("%d%d",&n,&p);
    if(p<=n/2)
    {
        for(i=0;i<=n/2;i+=2)
        {
            if(i==p||i+1==p)
            {
                break;
            }
            c++;
        }

    }
    else
    {
        if(n%2==1)
        {
        for(i=n;i>n/2;i-=2)
        {
          
          if (i == p || i - 1 == p) {
            break;   
            }
            c++;
        }
        }
        else
        {
            for(i=n+1;i>n/2;i-=2)
            {
                if(i==p||i-1==p)
                {
                    break;
                }
                c++;
            }
        }
    }
    printf("%d",c);
}
