#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch;
    char s[100];
    char sen[1000];
    scanf("%c",&ch);
    scanf("%s",s);
    scanf("%[^/]s",sen);
    printf("%c\n",ch);
    printf("%s",s);
    printf("%s\n",sen);
    return 0;
}

