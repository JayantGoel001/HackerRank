#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char str[1000];
    scanf("%[^\n]s",str);
    int i=0;
   // printf("%s",str);
    while(str[i]!='\0')
    {
        if(str[i]==' ')
        {
            printf("\n");
        }
        else
        {
            printf("%c",(char)str[i]);
        }
      i++;
    }
    return 0;
}

