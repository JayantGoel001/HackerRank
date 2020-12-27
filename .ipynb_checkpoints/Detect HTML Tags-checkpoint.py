import re
n=int(input())
lis=[]
for _ in range(n):
    l=[]
    l=re.findall("\<\w+.",input())
    for i in range(len(l)):
        lis.append(l[i])
lis=list(set(lis))
lis.sort()
c=0
for i in lis:
    if c!=len(lis)-1:
        print(i[1:-1],end=";")
    else:
        print(i[1:-1])
    c+=1