import numpy as np
from math import sqrt
n=int(input())
l=list(map(int,input().split()))
mu=np.mean(l)
std=np.std(l)
print(round(mu,1))
print(np.median(l))
print(np.bincount(l).argmax())
print(round(std,1))
print(round(mu-1.96*(std)/sqrt(n),1),round(mu+1.96*(std)/srt(n),1))
