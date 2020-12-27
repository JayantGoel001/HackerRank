import re
n=int(input())
for i in range(n):
    x=input()
    res=re.match("^[789]\d{9}$",x)
    if(res==None):
        print("NO")
    else:
        print("YES")
