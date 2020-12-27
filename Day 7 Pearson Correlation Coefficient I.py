import math
n=int(input())
X=list(map(float,input().split()))
y=list(map(float,input().split()))
ux=sum(X)/len(X)
uy=sum(y)/len(y)
sigmaX=0
sigmay=0
for i in range(len(X)):
    sigmaX+=(X[i]-ux)**2
    sigmay+=(y[i]-uy)**2
s=0
sigmaX/=len(X)
sigmay/=len(y)
for i in range(len(X)):
    s+=((X[i]-ux)*(y[i]-uy))/(len(X)*math.sqrt(sigmaX*sigmay))
print(s)
