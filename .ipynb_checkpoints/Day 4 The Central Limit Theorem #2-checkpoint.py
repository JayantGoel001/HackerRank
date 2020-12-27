import math
n=250
mu=2.4*100
sigma=2*10
x=(0.5)*(1+math.erf((n-mu)/(math.sqrt(2)*sigma)))
print(round(x,4))