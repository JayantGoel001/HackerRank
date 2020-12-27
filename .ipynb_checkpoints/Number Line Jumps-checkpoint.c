#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x1,v1,x2,v2;
    int x,v;
    int c,d;
    c=0;
    d=0;
    scanf("%d %d %d %d",&x1,&v1,&x2,&v2);
    if((x2>x1)&&(v2>v1))
    {
        printf("NO");
    }
    else if((x1>x2)&&(v1>v2))
    {
        printf("NO");
    }
    else
    {
        int i=0;
        while(i<10000)
        {
            x=x1+i*v1;
            v=x2+i*v2;
            if(x==v)
            {
                printf("YES");
                break;
            }
            if(x>v)
            {
                c++;
            }
            if(x<v)
            {
                d++;
            }
            if(c==5000||d==5000)
            {
                printf("NO");
                break;
            }
            i++;
        }
    }

}