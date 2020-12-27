n=int(input())
c=0
while(n!=0):
    if n%2==0:
        c+=1
    else:
        c+=0
    n=n//2
print(pow(2,c))
