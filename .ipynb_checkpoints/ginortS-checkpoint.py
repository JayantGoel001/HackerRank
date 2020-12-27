n=input()
sl=[]
cl=[]
odl=[]
evl=[]
for i in range(len(n)):
    x=ord(n[i])
    if x>=97 and x<=122:
        sl.append(n[i])
    elif x>=65 and x<=91:
        cl.append(n[i])
    elif x>=48 and x<=57 and x%2!=0:
        odl.append(n[i])
    else:
        evl.append(n[i])
sl.sort()
cl.sort()
odl.sort()
evl.sort()
sl="".join(sl)
cl="".join(cl)
odl="".join(odl)
evl="".join(evl)
print(sl+cl+odl+evl)