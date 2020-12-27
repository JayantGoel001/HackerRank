# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=input()
res=re.search(r"\.*([a-zA-Z0-9])\1+",n)
if(res!=None):
    print(res.group(1))
else:
    print("-1")

