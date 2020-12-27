from itertools import combinations_with_replacement
st,n=input().split()
n=int(n)
l=list(combinations_with_replacement(sorted(st),n))
for i in l:
    for j in i:
        print(j,end="")
    print()

