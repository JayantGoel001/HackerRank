import math
physics=[15,12,8,8,7,7,7,6,5,3]
history=[10,25,17,11,13,17,20,13,9,15]
meanp=sum(physics)//10
meanh=sum(history)//10
stdp=0
stdh=0
s=0
for i in range(10):
    s+=(physics[i]-meanp)*(history[i]-meanh)
    stdp+=((physics[i]-meanp)**2)/10
    stdh+=((history[i]-meanh)**2)/10
print(s/(10*math.sqrt(stdh*stdp)))