n=int(input())
i=0
while(True):
    if(n>3*(2**i-1) and n<=3*(2**(i+1)-1)):
        break
    i+=1
x=3*(2**i)
#print("*",x)
diff=n-x+2
"""for j in range(3*(2**i-1)+1,n):
    x-=1"""
print(x-diff)
