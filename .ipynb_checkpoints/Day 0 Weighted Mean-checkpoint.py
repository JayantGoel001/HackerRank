n=int(input())
ar=[]
ar2=[]
sum2=0
ar=list(map(int,input().split()))
ar2=list(map(int,input().split()))
for i in range(n):
    sum2=sum2+ar[i]*ar2[i]
print("%.1f"%(sum2/sum(ar2)))
