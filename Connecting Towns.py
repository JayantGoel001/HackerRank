n=int(input())
for i in range(n):
    x=int(input())
    l=list(map(int,input().split()))
    mul=1
    for i in range(len(l)):
        mul*=l[i]
    print(mul%1234567)
