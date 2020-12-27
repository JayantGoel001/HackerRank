#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char str[1000];
    int i,j=0,c;
    scanf("%[^\n]s",str);
    for(i=48;i<58;i++)
    {
        c=0;
        j=0;
        while(str[j]!='\0')
        {
            if(str[j]==(char)i)
            {
                c++;
            }
            j++;
        }
        printf("%d ",c);
    }
    return 0;
}