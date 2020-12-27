# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter
n=int(input())
l=list(map(int,input().split()))
l=Counter(l)
x=int(input())
s=0
for i in range(x):
    q,w=input().split()
    q=int(q)
    w=int(w)
    if l[q]!=0:
        s=s+w
        l[q]=l[q]-1
print(s)
