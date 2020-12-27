from itertools import combinations
n=int(input())
l=list(input().split())
k=int(input())
comb=[]
comb=list(combinations(l,k))
c=0
for i in range(len(comb)):
    if 'a' in comb[i]:
        c+=1
print("%.3f"%(c/len(comb)))
