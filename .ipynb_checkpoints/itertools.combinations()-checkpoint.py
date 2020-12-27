from itertools import combinations
st,n=input().split()
n=int(n)
l=[]
x=[]
for i in range(n):
    l.append(list(combinations(sorted(st),i+1)))
    l[i].sort()
for i in range(n):
    for j in l[i]:
        for k in j:
            print(k,end="")
        print()
