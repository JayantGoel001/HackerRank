import math
mean=50000*11
std=10000*math.sqrt(11)
x=74000+47000*11-20000
res=(0.5)*(1+math.erf((x-mean)/(math.sqrt(2)*std)))-(0.5)*(1+math.erf((0-mean)/(math.sqrt(2)*std)))
print(1res)
