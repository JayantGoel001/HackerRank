n,k = map(int,input().split())
L = []
s=0
for i in range(n):
    li,ti = map(int,input().split())
    if ti==1:
        L.append(li)
    else:
        s+=li
L.sort(reverse=True)
if k<len(L):
    for i in range(0,k):
        s+=L[i]
    for i in range(k,len(L)):
        s-=L[i]
else:
    for i in range(0,len(L)):
        s+=L[i]
print(s)


