# Enter your code here. Read input from STDIN. Print output to STDOUT
from statistics import median
n=int(input())
ar=[]
ar=list(map(int,input().split()))
ar.sort()
#print(ar)
print(int(median(ar[:n//2])))
print(int(median(ar)))
print(int(median(ar[(n+1)//2:])))
