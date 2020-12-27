st1=list(input())
st2=list(input())
l=[0]*26
for i in range(len(st1)):
    l[ord(st1[i])-97]+=1
for i in range(len(st2)):
    l[ord(st2[i])-97]-=1
s=0
for i in range(26):
    s+=abs(l[i])
print(s)
