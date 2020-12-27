def fact(x):
    if x<=1:
        return 1
    else:
        return x*fact(x-1)
def ncr(n,r):
    return fact(n)/(fact(n-r)*fact(r))
Pb=1.09/2.09
Pg=1/2.09
x=ncr(6,3)*pow(Pb,3)*pow(Pg,3)+ncr(6,4)*pow(Pb,4)*pow(Pg,2)+ncr(6,5)*pow(Pb,5)*pow(Pg,1)+ncr(6,6)*pow(Pb,6)*pow(Pg,0)
print ound(x,3)
