import math
mu=70
sigma=10
print round((1-(0.5)*(1+math.erf((80-mu)/(math.sqrt(2)*sigma))))*100,2)
print round((1-(0.5)*(1+math.erf((60-mu)/(math.sqrt(2)*sigma))))*100,2)
print round((0.5)*(1+math.erf((60-mu)/(math.sqrt(2)*sigma)))*100,2)
