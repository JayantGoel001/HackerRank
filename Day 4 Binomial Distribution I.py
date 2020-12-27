# Enter your code here. Read input from STDIN. Print output to STDOUT
def fact(x):
    if x==1 or x==0:
        return 1
    else:
        return x*fact(x-1)
def combination(x):
    f=fact(6)/(fact(x)*fact(6-x))
    return f
x=1.09
y=1.0
sum=0.0
for i in range(3,7):
    sum=sum+combination(i)*(pow(x/(x+y),i))*pow(y/(x+y),6-i);
print("%.3f"%(sum))
