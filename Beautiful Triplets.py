"""import math
n,d=input().split()
n=int(n)
d=int(d)
l=list(map(int,input().split()))
cnt=0
#print(n)
for i in range(n-d-1):
    c=1
    x=l[i]
    for j in range(i+1,n):
        if abs(x-l[j])==d:
            c+=1
            #print('"*",x)
            x=l[j]
            if c==3:
                cnt+=1
                break
print(cnt)"""
n,d=input().split()
n=int(n)
d=int(d)
l=list(map(int,input().split()))
cmt=0
for i in range(len(l)):
    if l[i]+d in l and l[i]+2*d in l:
        cmt+=1
print(cmt)
