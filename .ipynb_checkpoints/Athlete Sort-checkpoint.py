n,m=map(int,input().split())
l=[[]*m]*n
temp=[]
for i in range(n):
    l[i]=list(map(int,input().split()))
k=int(input())
for i in range(n):
    for j in range(n-1):
        if l[j][k]>l[j+1][k]:
            temp=l[j] 
            l[j]=l[j+1]
            l[j+1]=temp
for i in range(n):
    for j in range(m):
        print(l[i][j],end=" ")
    print()