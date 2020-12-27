#include<stdio.h>
int main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    int i,j;
    int x,y,z,maxx=0,maxy=0,maxz=0;
    for(i=1;i<n;i++)
    {
        for(j=i+1;j<=n;j++)
        {
            x=i&j;
            y=i|j;
            z=i^j;
            if(maxx<x&&x<k)
            {
                maxx=x;
            }
            if(maxy<y&&y<k)
            {
                maxy=y;
            }
            if(maxz<z&&z<k)
            {
                maxz=z;
            }
        }
    }
    printf("%d\n%d\n%d",maxx,maxy,maxz);
}
