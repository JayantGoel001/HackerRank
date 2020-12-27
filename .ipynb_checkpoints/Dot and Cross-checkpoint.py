import numpy
n=int(input())
l1=[[]*n]*n
for i in range(n):
    l1[i]=list(map(int,input().split()))
l2=[[]*n]*n
for i in range(n):
    l2[i]=list(map(int,input().split()))
print(numpy.dot(l1,l2))