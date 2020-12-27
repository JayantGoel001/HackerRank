# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=int(input())
c=0
for i in range(n):
    s=input()
    res=re.findall('HackerRank',s,flags=re.IGNORECASE)
    #print(res.group())
    if(len(res)!=0):
        c=c+1
print(c)
