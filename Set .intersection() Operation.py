# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
s1=set(map(int,input().split()))
n=int(input())
s2=set(map(int,input().split()))
s3=s1.intersection(s2)
print(len(s3))

