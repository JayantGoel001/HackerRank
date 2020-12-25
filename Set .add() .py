# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
s=set("")
for i in range(n):
    s.add(input())
print(len(s))
