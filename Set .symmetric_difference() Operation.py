# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
l1=set(map(int,input().split()))
n=int(input())
l2=set(map(int,input().split()))
l3=l1.union(l2)
l4=l1.intersection(l2)
l5=l3.difference(l4)
print(len(l5))
