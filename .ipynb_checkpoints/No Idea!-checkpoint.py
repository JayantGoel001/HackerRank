n,m=input().split()
n=int(n)
m=int(m)
l=list(map(int,input().split()))
a=set(map(int,input().split()))
b=set(map(int,input().split()))
x=0
for i in l:
    if(i in a):
        x=x+1
    elif(i in b):
        x=x-1
print(x)