n=int(input())
for i in range(n):
    a,b,c=input().split()
    a=int(a)
    b=int(b)
    c=int(c)
    x=pow(a,b)
    back=int(x//c*c)
    front=int((x//c+1)*c)
    if x-back>front-x:
        print(front)
    else:
        print(back)
