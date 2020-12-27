e=100
n,k=map(int,input().split())
l=list(map(int,input().split()))
i=0
while(True):
    
    if l[i]==1:
        e=e-2-1
    else:
        e-=1
    i=(i+k)%n
    if(i==0):
        break
print(e)