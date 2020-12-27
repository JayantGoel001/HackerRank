n=int(input())
l=list(map(int,input().split()))
l2=[0]*100
for i in range(len(l)):
    l2[l[i]]+=1
for i in l2:
    print(i,end=" ")