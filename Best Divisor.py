def sum_of_digit(n):
    s=0
    while(n!=0):
        s+=n%10
        n=n//10
    return s
n=int(input())
m=0
for i in range(1,n+1):
    x=sum_of_digit(i)
    if n%i==0 and m<x:
        m=x
        val=i
print(val)

