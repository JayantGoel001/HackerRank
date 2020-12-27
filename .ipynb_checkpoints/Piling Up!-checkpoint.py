n=int(input())
for _ in range(n):
    x=int(input())
    l=list(map(int,input().split()))
    i=0
    while(i<x-1 and l[i]>=l[i+1]):
        i+=1
    while(i<x-1 and l[i]<=l[i+1]):
        i+=1
    if(i==x-1):
        print("Yes")
    else:
        print("No")
