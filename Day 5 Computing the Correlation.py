import math
def Std(l,mean,n):
    s=0
    for i in range(n):
        s+=(l[i]-mean)**2
    return math.sqrt(s/(n-1))
def Coorelation(a,b,n,s1,s2,meana,meanb):
    r=0
    for i in range(n):
       r+=(a[i]-meana)*(b[i]-meanb)
    return r/((n-1)*s1*s2)
mathe=[]
phy=[]
chem=[]
meanm=0
meanp=0
meanc=0
n=int(input())
for i in range(n):
    m,p,c=map(int,input().split())
    meanc+=c
    meanm+=m
    meanp+=p
    mathe.append(m)
    phy.append(p)
    chem.append(c)
meanm/=n
meanc/=n
meanp/=n
sp=Std(phy,meanp,n)
sm=Std(mathe,meanm,n)
sc=Std(chem,meanc,n)
mp=Coorelation(mathe,phy,n,sp,sm,meanm,meanp)
pc=Coorelation(phy,chem,n,sp,sc,meanp,meanc)
cm=Coorelation(chem,mathe,n,sc,sm,meanc,meanm)
print(round(mp,2))
print(round(pc,2))
print(round(cm,2))
