n=int(input())
l=list(map(int,input().split()))
x=l[0]
for i in range(1,n):
    x=x^l[i]
print(x)