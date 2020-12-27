from itertools import groupby
st=input()
l=[]
l2=[]
for k,g in groupby(st):
    l.append(list(g))
    l2.append(k)
for i in range(len(l2)):
    print("("+str(len(l[i]))+", "+str(l2[i])+")",end=" ")