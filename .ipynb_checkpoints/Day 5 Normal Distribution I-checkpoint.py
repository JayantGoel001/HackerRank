import math
mean,sd=map(int,input().split())
x1=float(input())
xf,xt=map(int,input().split())

phi=(0.5)*(1+math.erf((x1-mean)/(sd*1.41)))
print("%.3f"%(phi))

phi2=(0.5)*(1+math.erf((xt-mean)/(sd*1.41)))-(0.5)*(1+math.erf((xf-mean)/(sd*1.41)))
print("%.3f"%(phi2))