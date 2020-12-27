def fact(x):
    if x<=1:
        return 1
    else:
        return x*fact(x-1)
def ncr(n,r):
    return fact(n)/(fact(n-r)*fact(r))
Ph=0.8
Pm=0.2
x=ncr(4,3)*pow(Ph,3)*pow(Pm,1)+ncr(4,4)*pow(Ph,4)*pow(Pm,0)
y=ncr(4,0)*pow(Ph,0)*pow(Pm,4)+ncr(4,1)*pow(Ph,1)*pow(Pm,3)
print round(x,3)
print round(y,3)