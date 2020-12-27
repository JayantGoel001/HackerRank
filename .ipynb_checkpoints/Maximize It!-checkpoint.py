from itertools import product
n,m=map(int,input().split())
l=[]
for i in range(n):
    l.append((list(map(int,input().split())))[1:])
for _ in range(n):
    result=map(lambda x:sum((i*i)%m for i in x)%m,product(*l))
print(max(result))