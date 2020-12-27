n,m=map(int,input().split())
l=[[0]*m]*n
for i in range(n):
    l[i]=list(map(int,input().split()))
ans=0
for i in range(n):
    for j in range(m):
        up=0
        left=0
        if(i<n-1):
            left=l[i+1][j]
        if(j<m-1):
            up=l[i][j+1]
        ans+=abs(up-l[i][j])+abs(left-l[i][j])
        if(i==0):
            ans+=l[i][j]
        if(j==0):
            ans+=l[i][j]
print(2*m*n+ans)