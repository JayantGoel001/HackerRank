# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
n=int(input())
string=""
for i in range(n):
    st=input()
    string=string+"\n"+st
l=re.findall(":?.(#[a-fA-F0-9]{6}|#[a-fA-F0-9]{3})",string)
for i in range(len(l)):
    st=str(l[i])
    print(st[st.index('#'):])
