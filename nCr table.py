def fact(n):
    f=1
    for i in range(2,n+1):
        f=f*i
    return f
x=int(input())
for j in range(x):
    num=int(input())
    l=[]
    x=fact(num)
    for i in range(0,num//2+1):
        cr=(x//(fact(i)*fact(num-i)))%(10**9)
        l.append(cr)
        print(cr,end=" ")
    if num%2==0:
        for i in range(num//2-1,-1,-1):
            print(l[i],end=" ")
    else:
        for i in range(num//2,-1,-1):
            print(l[i],end=" ")
    print()
