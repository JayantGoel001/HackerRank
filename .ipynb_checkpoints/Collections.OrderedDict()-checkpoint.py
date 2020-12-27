from collections import OrderedDict,Counter
import re
n=int(input())
l=[]
for i in range(n):
    l.append(input())
dic=OrderedDict()
dic=Counter(l)
for key,value in dic.items():
    res=re.findall("^[a-zA-Z\s]+",key)
    res2=re.findall("\d+$",key)
    print(res[0],end="")
    print(int(res2[0])*value)

