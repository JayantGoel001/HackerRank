# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
l=set(map(int,input().split()))
n=int(input())
l2=set(map(int,(input().split())))
l3=l.union(l2)
l4=l.intersection(l2)
l5=l3.difference(l4)
l5=sorted(l5)
for i in l5:
    print(i)

