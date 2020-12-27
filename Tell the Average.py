# Enter your code here. Read input from STDIN. Print output to STDOUT
def value_of_S(L):
    while(len(L)>1):
        a = L[0]
        b = L[1]
        L.remove( L[1])
        L[0] = a+b+a*b
    return L[0] % 1000000007
n=int(input())
print(value_of_S(list(map(int,input().split()))))
