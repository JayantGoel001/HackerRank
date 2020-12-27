# Enter your code here. Read input from STDIN. Print output to STDOUT
def isreverse(x):
    if x<10:
        return True
    else:
        rev=0
        num=x
        while(x!=0):
            rev=rev*10+x%10;
            x=x/10
        if num==rev:
            return True
        else:
            return False
def ispalin(x):
    if isreverse(x):
        return True
    else:
        return False
n=int(input())
l=list(map(int,input().split()))
if all(i>0 for i in l) and any(ispalin(i) for i in l):
    print("True")
else:
    print("False")
