from itertools import groupby
st=list(input())
l1=[]
l2=[]
for key,value in groupby(sorted(st)):
    l1.append(key)
    l2.append(list(value))
for i in range(0,len(l1)):
    for j in range(0,len(l1)-i-1):
        if(len(l2[j])<len(l2[j+1])):
            temp=[]
            temp=l2[j]
            l2[j]=l2[j+1]
            l2[j+1]=temp
            temp2=l1[j]
            l1[j]=l1[j+1]
            l1[j+1]=temp2
#print(l1)
#print(l2)
for i in range(0,3):
    print(l2[i][0],len(l2[i]))

