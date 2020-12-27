# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=int(input())
for _ in range(n):
    res=re.search("^[+-]{0,1}\d*\.\d*$",input())
    if res==None:
        print("False")
    else:
        print("True")
