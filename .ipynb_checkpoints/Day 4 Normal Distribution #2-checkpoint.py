import math
mu=20
sigma=2
print (0.5)*(1+math.erf((19.5-mu)/(math.sqrt(2)*sigma)))
print (0.5)*(1+math.erf((22-mu)/(math.sqrt(2)*sigma)))-(0.5)*(1+math.erf((20-mu)/(math.sqrt(2)*sigma)))