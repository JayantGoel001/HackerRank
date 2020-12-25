# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
from statistics import median
n=int(input())
ar=[]
ar2=[]
ar3=[]
ar=list(map(int,input().split()))
ar2=list(map(int,input().split()))
for i in range(n):
    for j in range(0,ar2[i]):
        ar3.append(ar[i])
ar3.sort()
#print(ar3)
n=len(ar3)
q1=(median(ar3[:n//2]))
#print(int(median(ar)))
q3=(median(ar3[(n+1)//2:]))
print("%.1f"%(q3-q1))
