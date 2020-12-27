n=int(input())
l=list(map(int,input().split()))
l2=[0]*(max(l)+1)
for i in range(len(l)):
    l2[l[i]]+=1
for i in range(max(l)+1):
    if l2[i]!=0:
        for j in range(l2[i]):
            print(i,end=" ")
