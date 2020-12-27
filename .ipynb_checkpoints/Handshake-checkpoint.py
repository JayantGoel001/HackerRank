def fact(n):
    f=1
    for i in range(2,n+1,1):
        f*=i
    return f
num=int(input())
for i in range(num):
    x=int(input())
    if(x<2):
        print("0")
    else:
        print(x*(x-1)//2)