#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int m,n;
    float x,y;
    scanf("%d %d",&m,&n);
    scanf("%f %f",&x,&y);
    int sum1,diff1;
    float sum2,diff2;
    sum1=m+n;
    diff1=m-n;
    sum2=x+y;
    diff2=x-y;
    printf("%d %d\n",sum1,diff1);
    printf("%.1f %.1f",sum2,diff2);
    return 0;
}