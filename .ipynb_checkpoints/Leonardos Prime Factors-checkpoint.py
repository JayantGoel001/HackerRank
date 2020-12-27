n=int(input())
primes=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47]
for i in range(n):
    x=int(input())
    c=0
    res=1
    for j in primes:
        if j*res<=x:
            c+=1
            res=j*res
    print(c)