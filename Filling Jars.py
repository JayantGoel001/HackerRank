n,k=input().split()
n=int(n)
k=int(k)
s=0
for i in range(k):
    a,b,c=input().split()
    a=int(a)
    b=int(b)
    c=int(c)
    s+=c*(b-a+1)
print(s//n)
