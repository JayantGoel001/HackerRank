n=int(input())
arr=[]
arr=list(map(int,input().split()))
sum=0
for i in range(n):
    sum=sum+arr[i]
print("%.1f"%(sum/n))
arr.sort()
if n%2==0:
    med=(arr[n//2]+arr[n//2-1])/2
    print ("%.1f"%(med))
else:
    med=arr[n//2]
    print("%.1f"%(med))
max1=0
c=1
mode=0
for i in range(0,n):
    m=arr[i]
    for j in range(i+1,n):
        if(arr[j]==m):
            c=c+1
        else:
            if(c>max1):
                max1=c
                mode=m
            c=1
print(mode)
