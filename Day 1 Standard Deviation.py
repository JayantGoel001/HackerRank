# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
n=int(input())
arr=[]
arr=list(map(int,input().split()))
mean=sum(arr)/n
sd=0
for i in range(0,n):
    sd=sd+math.pow(abs(arr[i]-mean),2)
sd=sd/n
print("%.1f"%(math.sqrt(sd)))

