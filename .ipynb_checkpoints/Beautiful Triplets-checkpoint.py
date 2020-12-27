n,d=input().split()
n=int(n)
d=int(d)
l=list(map(int,input().split()))
cmt=0
for i in range(len(l)):
    if l[i]+d in l and l[i]+2*d in l:
        cmt+=1
print(cmt)