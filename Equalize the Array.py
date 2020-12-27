from collections import Counter
n=int(input())
l=list(map(int,input().split()))
d=Counter(l)
m=0
#print(d)
for i in l:
    #print(d[i])
    if(d[i]>m):
        m=d[i]
#print(m)
print(n-m)
