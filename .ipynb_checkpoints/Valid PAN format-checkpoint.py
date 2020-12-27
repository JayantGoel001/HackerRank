import re
n=int(input())
for i in range(n):
    st=input()
    res=re.match("^[A-Z]{5}[0-9]{4}[A-Z]$",st)
    if(res!=None):
        print("YES")
    else:
        print("NO")
