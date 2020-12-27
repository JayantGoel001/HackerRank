n=int(input())
l=list(map(int,input().split()))
l.sort(reverse=True)
sum=0
for i in range(n):
    sum+=pow(2,i)*l[i]
print(sum)