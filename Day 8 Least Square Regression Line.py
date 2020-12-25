x=[95,85,80,70,60]
y=[85,95,70,65,70]
sigmaX=sum(x)
sigmay=sum(y)
sigmaX2=0
sigmaXy=0
for i in range(5):
    sigmaXy+=x[i]*y[i]
    sigmaX2+=x[i]**2
b=(5*sigmaXy-sigmaX*sigmay)/(5*sigmaX2-sigmaX**2)
a=sigmay/5-b*sigmaX/5
print(a+b*80)
