# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
x=input()
res=re.findall("(?<=[^aeiouAEIOU])[aeiouAEIOU]{2,}[^aeiouAEIOU]",x)
#print(res)
for i in range(len(res)):
    print(res[i][:-1])
    if(i==len(res)-1):
        break
else:
    print("-1")
