# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import product
a=list(map(int,input().split()))
b=list(map(int,input().split()))
l=list(product(a,b))
for i in range(len(l)):
    print(l[i],end=" ")
