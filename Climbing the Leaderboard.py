def insertValue(l,el,n):
    #mid=(n-1)//2
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
    #print(l)
    #return i+1
n=int(input())
l=list(set(list(map(int,input().split()))))
l.sort(reverse=True)
n2=int(input())
l2=list(map(int,input().split()))
#print(l)
mx=l[0]
n=len(l)
mn=l[n-1]
#print(l)
for i in l2:
    if(i>=mx):
        print(1)
    elif(i<mn):
        print(n+1)
    else:
        print(insertValue(l,i,n))
        #print(l.index(i)+1)
        #l[:l.index(i)]
    
