import re
n=int(input())
for i in range(n):
    s=input()
    res=re.search("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$",s)
    if(res!=None):
        print("VALID")
    else:
        print("INVALID")
