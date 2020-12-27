# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
l1=set(map(int,input().split()))
n=int(input())
l2=set(map(int,input().split()))
l3=l1.difference(l2)
print(len(l3))
