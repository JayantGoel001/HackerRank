from itertools import combinations
n,m=map(int,input().split())
l=[]*n
for i in range(n):
    l.append(input())
ar=list(combinations(l,2))
max=0
c=0
for i in ar:
    maxto=str(bin(((int(i[0],2) | int(i[1],2)))))[2:].count('1')
    if(maxto>max):
        max=maxto
        c=1
    elif(maxto==max):
        c+=1
print(max)
print(c)
