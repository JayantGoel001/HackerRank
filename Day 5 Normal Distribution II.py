import math
mu=70
sd=10
x=80
y=60
phi1=(0.5)*(1+math.erf((80-mu)/(sd*math.sqrt(2))))
phi2=(0.5)*(1+math.erf((60-mu)/(sd*math.sqrt(2))))
phi3=(0.5)*(1+math.erf((60-mu)/(sd*math.sqrt(2))))
print(round(100-(phi1*100),2))
print(round(100-(phi2*100),2))
print(round((phi3*100),2))
