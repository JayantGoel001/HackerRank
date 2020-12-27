import numpy
n,m=map(int,input().split())
l=[[]*m]*n
for i in range(n):
    l[i]=list(map(int,input().split()))
print(numpy.product(numpy.sum(l,axis=0)))



