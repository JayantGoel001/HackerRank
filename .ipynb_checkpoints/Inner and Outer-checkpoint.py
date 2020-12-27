import numpy
l1=list(map(int,input().split()))
l2=list(map(int,input().split()))
a=numpy.array(l1)
b=numpy.array(l2)
print(numpy.inner(a,b))
print(numpy.outer(a,b))