import re
n=int(input())
for i in range(n):
    s=input()
    match=re.search("^[_.]\d+[a-zA-Z]*([_])?$",s)
    if match==None:
        print("INVALID")
    else:
        print("VALID")
