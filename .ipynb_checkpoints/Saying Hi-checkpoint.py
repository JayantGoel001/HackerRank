import re
n=int(input())
for i in range(n):
    st=input()
    res=re.search("^[H][I]\s[qwertyuioplkjhgfsazxcvbnm]",st,re.IGNORECASE)
    if res!=None:
        print(st)