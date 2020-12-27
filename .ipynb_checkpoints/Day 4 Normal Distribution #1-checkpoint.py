import math
mu=30
sigma=4
print (0.5)*(1+math.erf((40-mu)/(math.sqrt(2)*sigma)))
print (1-(0.5)*(1+math.erf((21-mu)/(math.sqrt(2)*sigma))))
print (0.5)*(1+math.erf((35-mu)/(math.sqrt(2)*sigma)))-(0.5)*(1+math.erf((30-mu)/(math.sqrt(2)*sigma)))