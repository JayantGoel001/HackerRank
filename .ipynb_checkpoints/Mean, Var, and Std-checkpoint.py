import numpy
n,m=map(int,input().split())
l=[[]*m]*n
for i in range(n):
    l[i]=list(map(int,input().split()))
numpy.set_printoptions(legacy='1.13')
print(numpy.mean(l,axis=1))
print(numpy.var(l,axis=0))
print((numpy.std(l)))