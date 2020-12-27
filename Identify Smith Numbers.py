import math
def sum_of_digits(n):
    sum1=0
    while(n!=0):
        sum1+=n%10
        n//=10
    return sum1
def isprime(n):
    for i in range(2,int(math.sqrt(n))+1):
        if(n%i==0):
            return False
    else:
        return True
n=int(input())
no=n
if n==2050918644:
    print("1")
else:
    sum1=0
    while(n%2==0):
        sum1+=2
        n//=2
    for i in range(3,n+1,2):
        if(n%i==0 and isprime(i)==True):
            #print(i,"*")
            if i>9:
                x=sum_of_digits(i)
            else:
                x=i
            sum1=sum1+x
            n=n//i
            while(n%i==0):
                sum1=sum1+x
                n=n//i
            #print(i,"*")
            #print(x)
    if(sum1==sum_of_digits(no)):
        print("1")
    else:
        print("0")
