import re
n=int(input())
st=""
for i in range(n):
    x=input()
    st=re.sub(" &&(?= )"," and",x)
    w=re.sub(" \|\|(?= )"," or",st)
    print(w)
