n=int(input())
for _ in range(n):
    l,k=map(int,input().split())
    lis=[]
    if   k<l//2:
        print(k*2+1)
    else:
        print((l-k-1)*2)
