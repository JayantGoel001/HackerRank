from collections import defaultdict
n,k=map(int,input().split())
l=[]
for i in range(n):
    l.append(input())
l2=[]
for i in range(k):
    l2.append(input())
d=defaultdict(list)
for i in range(n):
    d[l[i]].append(i+1)
for i in range(k):
    if d[l2[i]]!=[]:
        for j in d[l2[i]]:
            print(j,end=" ")
    else:
        print("-1",end="")
    print()
