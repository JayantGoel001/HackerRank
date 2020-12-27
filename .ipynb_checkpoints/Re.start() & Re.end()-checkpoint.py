import re
a = input()
b = input() 
w=0
for i in range(0,len(a)+1-len(b)):
    x = a[i:i+len(b)]
    if x==b:
        print("("+str(i)+", "+str((i+len(b)-1))+")")
        w+=1
if w==0:
    print("("+str(-1)+", "+str(-1)+")")