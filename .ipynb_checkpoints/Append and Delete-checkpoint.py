def everysame(st1,st2):
    c=1
    for i in range(len(st1)-1):
        if(st1[i]==st1[i+1]):
            c+=1
    if(c!=len(st1)):
        return False
    c=1
    for i in range(len(st2)-1):
        if(st2[i]==st2[i+1]):
            c+=1
    if(c!=len(st2)):
        return False
    return True
st1=input()
st2=input()
n=int(input())
if st1==st2 or ((st1 in st2 or st2 in st1) and everysame(st1,st2)):
    print("Yes")
elif(len(st1)+len(st2)<n):
    print("Yes")
else:
    if len(st1)>len(st2):
        l=len(st2)
    else:
        l=len(st1)
    c=0
    for i in range(l):
        if(st1[i]!=st2[i]):
            break
        c+=1
    x=len(st1)-c
    y=len(st2)-c
    if(x+y==n):
        print("Yes")
    else:
        print("No")