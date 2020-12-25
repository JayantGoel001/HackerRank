#include<stdio.h>
int main()
{
    int y;
    scanf("%d",&y);
    int nod = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
     if (y <= 1917) {
      if (y % 4 == 0) 
      {
          nod=nod+1;

      } 
      printf("%d.09.%d",256-nod,y);
    }
    else if(y>=1919)
    {
        if(y%400==0||(y%4==0&&y%100!=0))
        {
            nod=nod+1;
        }
        printf("%d.09.%d", 256 - nod, y);
    }
    else
    {
        nod=nod-13;
        printf("%d.09.%d", 256 - nod, y);
    }
}
