import math
n=int(input())
for i in range(n):
    c=0
    l=list(map(int,input().split()))
    for j in range(1,int(math.sqrt(l[1]))+1):
        if(j*j<=l[1] and j*j>=l[0]):
            c+=1
    print(c)