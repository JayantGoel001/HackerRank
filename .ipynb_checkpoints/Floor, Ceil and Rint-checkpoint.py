import numpy
l=list(map(float,input().split()))
numpy.set_printoptions(sign=' ')
ma=numpy.array(l)
print(numpy.floor(ma))
print(numpy.ceil(ma))
print(numpy.rint(ma))