import re
n=int(input())
l=[]
for i in range(n):
    l.append(input())
x=int(input())
for i in range(x):
    s=input()
    w=0
    for j in range(n):
       res=re.findall(r"\b"+s+r"\b",l[j])
       #print(res)
       w=w+len(res)
    print(w)
    
