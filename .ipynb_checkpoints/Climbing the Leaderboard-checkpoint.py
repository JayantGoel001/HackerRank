def insertValue(l,el,n):
    start=1
    end=n-2
    while(start<=end):
        mid=(start+end)//2
        if(l[mid]<el):
            end=mid-1
        elif(l[mid]>el):
            start=mid+1
        else:
            start=mid
            break
    return start+1

n=int(input())
l=list(set(list(map(int,input().split()))))
l.sort(reverse=True)
n2=int(input())
l2=list(map(int,input().split()))
mx=l[0]
n=len(l)
mn=l[n-1]
for i in l2:
    if(i>=mx):
        print(1)
    elif(i<mn):
        print(n+1)
    else:
        print(insertValue(l,i,n))