import math
st=input()
row=math.floor(math.sqrt(len(st)))
col=math.ceil(math.sqrt(len(st)))
if(row*col<len(st)):
    if(row<col):
        row=row+1
    else:
        col=col+1
l=[]
#print(l)
l2=[]
for i in range(0,row):
    for j in range(0,col):
        if(col*i+j<len(st)):
            l2.append(st[col*i+j])
        else:
            l2.append(" ")
    l.append(l2)
    #print(l)
    l2=[]
"""for i in range(row):
    if(len(l[i])!=col):
        l[i].append(' ')"""
#print(l)
for i in range(col):
    for j in range(row):
        if(l[j][i]!=' '):
            print(l[j][i],end="")
    print(end=" ")

