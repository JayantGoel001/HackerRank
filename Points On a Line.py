def check(l):
    for i in range(1,len(l)):
        if(l[0]!=l[i]):
            return False
    else:
        return True
n=int(input())
l1=[]
l2=[]
for i in range(n):
    x,y=input().split()
    x=int(x)
    y=int(y)
    l1.append(x)
    l2.append(y)
if check(l1)==True or check(l2)==True:
    print("YES")
else:
    print("NO")
