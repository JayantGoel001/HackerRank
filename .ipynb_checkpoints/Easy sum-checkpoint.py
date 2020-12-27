n=int(input())
for i in range(n):
    x,m=map(int,input().split())
    w=x//m
    s=m*(m-1)//2*w
    x=x-m*w
    s+=x*(x+1)//2
    print(s)