import re
n=int(input())
for i in range(n):
    s=input()
    match=re.split('[\s-]+',s)
    print("CountryCode="+match[0]+",LocalAreaCode="+match[1]+",Number="+match[2])
