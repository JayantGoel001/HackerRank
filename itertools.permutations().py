# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations
st,n=input().split()
n=int(n)
l=list(permutations(st,n))
l.sort()
for i in l:
    for j in i:
        print(j,end="")
    print()
