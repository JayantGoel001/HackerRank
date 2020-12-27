from collections import Counter
x=list(input())
c=Counter(x)
z=0
st=set(x)
for key,value in c.items():
    if(value%2!=0):
        z+=1
else:
    if(len(c.items())==1 or(z==0 or z==1)):
        print("YES")
    else:
        print("NO")