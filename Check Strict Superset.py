# Enter your code here. Read input from STDIN. Print output to STDOUT
l1=set(map(int,input().split()))
n=int(input())
for i in range(0,n):
    l=set(map(int,input().split()))
    if(len(l)>len(l1)):
        print(False)
        break
    else:
        s1=l1
        s2=l
        s3=s1.intersection(s2)
        if(len(s3)!=len(s2)):
            print(False)
            break
else:
    print(True)
