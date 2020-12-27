#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d",&n);
    int ar[n];
    int i;
    int sum=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
        sum=sum+ar[i];
    }
    printf("%d",sum);
    return 0;
}

