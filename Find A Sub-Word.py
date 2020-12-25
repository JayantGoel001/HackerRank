# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=int(input())
s=[]
for i in range(n):
    s.append(input())
x=int(input())
for i in range(x):
    c=0
    st=input()
    for j in range(n):
        res=re.findall(("\w"+st+"\w"),s[j])
        c=c+len(res)
    print(c)


