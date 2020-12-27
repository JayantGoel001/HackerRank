def fact(x):
    if x<=1:
        return 1
    else:
        return x*fact(x-1)
def ncr(n,r):
    return fact(n)/(fact(n-r)*fact(r))
Pr=0.12
Pa=0.88
x=ncr(10,0)*pow(Pr,0)*pow(Pa,10)+ncr(10,1)*pow(Pr,1)*pow(Pa,9)+ncr(10,2)*pow(Pr,2)*pow(Pa,8)
y=1-x+ncr(10,2)*pow(Pr,2)*pow(Pa,8)
print round(x,3)
print round(y,3)

