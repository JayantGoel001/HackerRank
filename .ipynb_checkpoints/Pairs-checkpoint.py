def search(l,x):
    low=0
    high=len(l)-1
    while(low<=high):
        mid=int((low+high)/2)
        if(l[mid]==x):
            return True
        elif(l[mid]<x):
            low=mid+1
        else:
            high=mid-1
    else:
        return False

n,k=map(int,input().split())
l=list(map(int,input().split()))
c=0

l.sort()
for i in range(n):
    if search(l,l[i]+k):
        c+=1
print(c)