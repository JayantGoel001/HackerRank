x=[15,12,8,8,7,7,7,6,5,3]
y=[10,25,17,11,13,17,20,13,9,15]
sigmaxy=0
sigmax=0
sigmay=0
sigmax2=0
n=10
for i in range(10):
    sigmaxy+=x[i]*y[i]
    sigmax+=x[i]
    sigmay+=y[i]
    sigmax2+=(x[i]**2)
m=(n*sigmaxy-sigmax*sigmay)/(n*sigmax2-sigmax**2)
c=(sigmay-m*sigmax)/nrint(m*10+c)

