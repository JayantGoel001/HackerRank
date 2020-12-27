import re
n=int(input())
for _ in range(n):
    st=input()
    try:
        x=re.compile(st)
        print("True")
    except re.error:
        print("False")
