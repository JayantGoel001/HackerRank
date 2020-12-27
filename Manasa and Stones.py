n=int(input())
for _ in range(n):
    n=int(input())
    a=int(input())
    b=int(input())
    l=[]
    for i in range(0,n):
        x=b*i+a*(n-i-1)
        l.append(x)
    l=list(set(l))
    l.sort()
    for i in l:
        print(i,end=" ")
    print()
