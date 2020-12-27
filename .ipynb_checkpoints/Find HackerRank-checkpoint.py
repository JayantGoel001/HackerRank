import re
n=int(input())
for i in range(n):
    st=input()
    rs1=re.match("hackerrank",st[0:10])
    rs2=re.match("hackerrank",st[-10:])
    if(rs1!=None and rs2!=None):
        print("0")
    elif(rs1==None and rs2!=None):
        print("2")
    elif(rs1!=None and rs2==None):
        print("1")
    else:
        print("-1")