# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
n=100
mu=500
sigma=80
pX=0.95
z=1.96
mubar=n*mu
sigmabar=math.sqrt(n)*sigma
A=(mubar-z*sigmabar)/100
B=(mubar+z*sigmabar)/100
print("%.2f"%(A))
print("%.2f"%(B))
