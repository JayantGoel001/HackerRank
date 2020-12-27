n=int(input())
l=list(map(int,input().split()))
l.sort()
min=abs(l[0]-l[1])
for i in range(1,len(l)-1):
        x=abs(l[i]-l[i+1])
        if x<min:
            min=x
print(min)