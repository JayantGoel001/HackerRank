n,k=map(int,input().split())
l=list(map(int,input().split()))
c=0
w=1
for i in range(n):
    ar=[]
    x=1
    while(l[i]>=k):
        for j in range(k):
            ar.append(x)
            x+=1
        if w in ar:
            c+=1
        ar=[]
        w+=1
        l[i]-=k
    ar=[]
    z=0
    for j in range(l[i]):
        ar.append(x)
        x+=1
        z=1
    if w in ar:
        c+=1
    if z==1:
        w+=1
print(c)
