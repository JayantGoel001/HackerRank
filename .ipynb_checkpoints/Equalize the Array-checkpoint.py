from collections import Counter
n=int(input())
l=list(map(int,input().split()))
d=Counter(l)
m=0
for i in l:
    if(d[i]>m):
        m=d[i]
print(n-m)