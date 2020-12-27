# Enter your code here. Read input from STDIN. Print output to STDOUT
def fact(n):
    if n==1:
        return 1
    else:
        return n*fact(n-1)
x=int(input())
print(fact(x))
