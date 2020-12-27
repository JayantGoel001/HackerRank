from collections import OrderedDict
from collections import Counter
n=int(input())
l=[]
for i in range(n):
    l.append(input())
dic=OrderedDict()
dic=Counter(l)
print(len(dic))
for key,value in dic.items():
    print(value,end=" ")