import math
transport=250
n=100
mu=2.4
sigma=2
mubar=n*mu
sigmabar=math.sqrt(n)*sigma
phi=(0.5)*(1+math.erf((transport-mubar)/(math.sqrt(2)*sigmabar)))
print("%.4f%(phi))
