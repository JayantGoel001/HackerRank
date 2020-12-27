n,mk = map(int,input().split())
l = list(map(int,input().split()))
l.sort()
i=0
s=0
while True:
    if s<=mk:
        s+=l[i]
        
    else:
        break
    i+=1
print(i-1)
