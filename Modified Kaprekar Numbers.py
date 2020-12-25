def check(x):
    sq=j*j;
    l=len(str(j))
    sum=sq//(10**l)+sq%(10**l)
    if(sum==x):
        return True
    else:
        return False
n=int(input())
x2=int(input())
c=0
for j in range(n,x2+1):
    if check(j):
        print(j,end=" ")
        c=c+1
if(c==0):
    print("INVALID RANGE")
