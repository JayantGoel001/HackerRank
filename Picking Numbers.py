n=int(input())
l=[]
l=list(map(int,input().split()))
m=0
for i in range(n):
    if(max(l)!=l[i] and l[i]+1 in l):
        x=l.count(l[i])+l.count(l[i]+1)
        if(x>=m):
            m=x
    if(l.count(l[i])>m):
        m=l.count(l[i])
print(m)
