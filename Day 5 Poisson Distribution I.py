# Enter your code here. Read input from STDIN. Print output to STDOUT
def fact(n):
    if(n==1 or n==0):
        return 1
    else:
        return n*fact(n-1)
lamb=2.5
k=5
print("%.3f"%(pow(lamb,k)*pow(2.71,-lamb)/fact(k)))
