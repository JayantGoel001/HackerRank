import numpy
l=list(map(float,input().split()))
x=int(input())
print(numpy.polyval(l,x))