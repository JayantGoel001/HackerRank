import math
transport=9800
n=49
mu=205
sigma=15
mubar=n*mu
sigmabar=math.sqrt(n)*sigma
phi=(0.5)*(1+math.erf((transport-mubar)/(math.sqrt(2)*sigmabar)))
print("%.4f"%(phi))
