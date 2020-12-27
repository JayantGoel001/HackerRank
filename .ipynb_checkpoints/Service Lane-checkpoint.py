n,w=input().split()
n=int(n)
w=int(w)
l=list(map(int,input().split()))
for i in range(w):
    x,y=input().split()
    x=int(x)
    y=int(y)
    print(min(l[x:y+1]))