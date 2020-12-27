import numpy
n=int(input())
l=[[]*n]*n
for i in range(n):
    l[i]=list(map(float,input().split()))
numpy.set_printoptions(legacy='1.13')
print(numpy.linalg.det(l))