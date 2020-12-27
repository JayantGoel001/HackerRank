n=int(input())
for i in range(n):
    size=int(input())
    s1=set(map(int,input().split()))
    size=int(input())
    s2=set(map(int,input().split()))
    if(len(s1)>len(s2)):
        print(False)
    else:
        s3=s1
        s4=s2
        s5=s3.intersection(s4)
        if(len(s5)==len(s1)):
            print("True")
        else:
            print("False")