import numpy
n,m=map(int,input().split())
l=[[]*m]*n
for i in range(n):
    l[i]=list(map(int,input().split()))
ar=numpy.array(l)
print(numpy.transpose(ar))
print(ar.flatten())



