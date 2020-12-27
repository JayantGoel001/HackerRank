# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=int(input())
st=""
for i in range(n):
    st+=input()+" "
res=re.findall("\w*\.*\w+\@[a-zA-Z]+(?:\.\w+)+",st)
res=list(set(res))
res.sort()
for i in range(len(res)):
    if i!=len(res)-1:
        print(res[i],end=";")
    else:
        print(res[i])
