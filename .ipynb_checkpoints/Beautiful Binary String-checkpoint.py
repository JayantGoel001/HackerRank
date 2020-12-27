import re
n=int(input())
st=input()
res=re.findall("010",st)
print(len(res))