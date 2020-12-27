n=int(input())
m=int(input())
max=0
for i in range(n,m+1):
    for j in range(i+1,m+1):
        if i^j>max:
            max=i^j
print(max)