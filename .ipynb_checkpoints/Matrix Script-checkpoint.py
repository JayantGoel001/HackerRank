import re
row,col=map(int,input().split())
l=[]
l2=[]
for i in range(row):
    l2=list(input())
    l.append(l2)
    
lx=[]
for i in range(col):
    for j in range(row):
        lx.append(l[j][i])
        
x=lx
for i in range(len(x)):
    x[i]="".join(x[i])
x="".join(x)
res=re.sub(r"(\w)(\W)+(\w)",r"\1 \3",x)
print(res)
