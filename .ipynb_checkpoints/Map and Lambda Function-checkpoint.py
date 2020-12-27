cube = lambda x:x**3 # complete the lambda function 

def fibonacci(n):
    if n==0:
        return []
    elif n==1:
        return [0]
    l=[0,1]
    a=0
    b=1
    i=2
    while(i!=n):
        c=a+b
        l.append(c)
        a=b
        b=c
        i=i+1
    return l
