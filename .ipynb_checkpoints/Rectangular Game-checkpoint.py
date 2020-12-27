lis=int(input())
l1=[]
l2=[]
for _ in range(lis):
    x,y=map(int,input().split())
    l1.append(x)
    l2.append(y)
print(min(l1)*min(l2))