n=int(input())
l=list(map(int,input().split()))
l.sort()
min=l[1]-l[0]
#print(l[0],l[1],end="")
for i in range(2,n):
    if l[i]-l[i-1]<min:
        min=l[i]-l[i-1]
for i in range(1,n):
    if l[i]-l[i-1]==min:
        print(l[i-1],l[i],end=" ")
