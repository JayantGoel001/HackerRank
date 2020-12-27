def binary(l,low,high,key):
    mid=(low+high)//2
    if(l[mid]==key):
        return mid
    elif(l[mid]<key):
        return binary(l,mid+1,high,key)
    else:
        return binary(l,low,mid-1,key)

    key=int(input())
n=int(input())
l=list(map(int,input().split()))
print(binary(l,0,n-1,key))