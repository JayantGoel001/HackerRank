n,k=input().split()
n=int(n)
k=int(k)
l=[]
for i in range(k):
    l.append(map(float,input().split()))
for i in zip(*l):
    print(sum(i)/len(i))