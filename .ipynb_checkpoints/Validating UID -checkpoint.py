import re
n=int(input())
for i in range(n):
    st=input()
    if(len(set(st))!=10):
        print("Invalid")
    else:
        a,b,c=[],[],[]
        a=re.findall("[a-zA-Z0-9]{10}",st)
        b=re.findall(".*[A-Z].*[A-Z].*",st)
        c=re.findall(".*\d.*\d.*\d.*",st)
        if(len(a)>0 and len(b)>0 and len(c)>0):
            print("Valid")
        else:
            print("Invalid")