def fact(n):
    l=[]
    l.append(1)
    for i in range(2,n+1):
        while n%i==0 :
            l.append(i)
            n=n//i
    return l
n=int(input())
for _ in range(n):
    x,y=map(int,input().split())
    lx=fact(x)
    ly=fact(y)
    w=1
    temp=1
    for i in range(len(lx)-1,0,-1):
        if lx[i] in ly:
            w=lx[i]
            temp*=w
            lx.remove(w)
            ly.remove(w)
    
    print((x*y)//(temp**2))
