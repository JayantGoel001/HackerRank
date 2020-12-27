def check(l):
    for i in l:
        if(i%2==1):
            return False
    else:
        return True
n=int(input())
l=list(map(int,input().split()))
x=0
for i  in range(n):
    if( l[i]%2==1 and i+1<=n-1):
        l[i]+=1
        l[i+1]+=1
        x+=2
if(check(l)==True):
    print(x)
else:
    print("NO")
