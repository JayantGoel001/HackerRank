import re
row,col=map(int,input().split())
l=[]
l2=[]
for i in range(row):
    l2=list(input())
    l.append(l2)
#print(l)
#x=""
lx=[]
for i in range(col):
    for j in range(row):
        lx.append(l[j][i])
#print(x)
x=lx
"""l=lx
#print(l)
x=[]
i=0
initial=0
cl=0
for i in range(len(l)-1):
    while(l[i].isalnum() and (l[i+1]=='!' or l[i+1]=='@'or l[i+1]=='#' or l[i+1]=='$' or l[i+1]=='%' or l[i+1]=='&' or l[i+1]==' ')):
        x.append(l[initial:i+1])
        #print(l[initial:i+1])
        j=i+1
        while(j!=len(l)-1 and not l[j].isalnum()):
            j+=1
            while(j==len(l)-1):
                x.append(l[i+1:j+1])
                cl=j
                break
        else:
            #x.append(l[i+1:j+1])
            x.append(' ')
        i=j
        initial=j
x.append(l[cl:initial])"""
for i in range(len(x)):
    x[i]="".join(x[i])
x="".join(x)
#print(x)
res=re.sub(r"(\w)(\W)+(\w)",r"\1 \3",x)
print(res)
#print(res)
