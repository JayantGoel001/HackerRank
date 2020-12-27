import math
n=int(input())
l=[]
l.append(0)
l.append(1)
a=0
b=1
for i in range(n):
    x=int(input())
    if x>max(l):
        while(x>max(l)):
            c=a+b
            l.append(c)
            a=b
            b=c
        if(x==max(l)):
            print("IsFibo")
        else:
            print("IsNotFibo")
    else:
        for j in range(len(l)):
            if l[j]==x:
                print("IsFibo")
                break
        else:
            print("IsNotFibo")
#print(l)
