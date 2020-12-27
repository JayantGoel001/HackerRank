def rank(a,l,n):
    for i in range(n):
        if l[i]==a:
            return i+1
n=int(input())
x=list(map(float,input().split()))
y=list(map(float,input().split()))
sortX=list(set(x))
sortX.sort()
sortY=list(set(y))
sortY.sort()
di=0
for i in range(n):
    di+=(rank(x[i],sortX,len(sortX))-rank(y[i],sortY,len(sortY)))**2
print(1-(6*di)/(n*(n**2-1)))
