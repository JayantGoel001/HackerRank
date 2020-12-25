n1=int(input())
l1=list(map(int,input().split()))
n2=int(input())
l2=list(map(int,input().split()))
if min(l1)<min(l2):
    x1=min(l1)
else:
    x1=min(l2)
for i in range(n1):
    l1[i]-=x1
for i in range(n2):
    l2[i]-=x1
if max(l1)>max(l2):
    x=max(l1)
else:
    x=max(l2)
l11=[0]*(x+1)
l22=[0]*(x+1)
for i in range(len(l1)):
    l11[l1[i]]+=1
for i in range(len(l2)):
    l22[l2[i]]+=1
for i in range(x+1):
    if(l11[i]!=l22[i]):
        print(i+x1,end=" ")
