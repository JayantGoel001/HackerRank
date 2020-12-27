import re
x=input()
res=re.findall("(?<=[^aeiouAEIOU])[aeiouAEIOU]{2,}[^aeiouAEIOU]",x)
for i in range(len(res)):
    print(res[i][:-1])
    if(i==len(res)-1):
        break
else:
    print("-1")
