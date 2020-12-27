import math
n=9800
mu=205*7
sigma=15*7
x=(0.5)*(1+math.erf((n-mu)/(math.sqrt(2)*sigma)))/100
print(round(,4))
