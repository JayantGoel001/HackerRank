import numpy
n,m,p=map(int,input().split())
l1=[[]*p]*n
l2=[[]*p]*m
for i in range(n):
    l1[i]=list(map(int,input().split()))
for i in range(m):
    l2[i]=list(map(int,input().split()))
ar1=numpy.array(l1)
ar2=numpy.array(l2)
print(numpy.concatenate((ar1,ar2),axis=0))