import re
from itertools import groupby
n=int(input())
for i in range(n):
    st=input()
    l1=[]
    l2=[]
    string=""
    for i in st:
        if(i!='-'):
            string+=i
    for key,value in groupby(list(string)):
        l1.append(key)
        l2.append(list(value))
    for i in range(len(l1)):
        if(len(l2[i])>=4):
            print("Invalid")
            break
    else:
        if(len(st)!=16 and len(st)!=19):
            print("Invalid")
        else:
            a=re.findall("^[456].*",st)
            b=re.findall("\d{4}(-)?\d{4}(-)?\d{4}(-)?\d{4}",st)
            if(len(a)>0 and len(b)>0):
                print("Valid")
            else:
                print("Invalid")
